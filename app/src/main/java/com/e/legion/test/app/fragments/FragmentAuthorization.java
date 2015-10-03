package com.e.legion.test.app.fragments;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.e.legion.test.app.R;
import com.e.legion.test.app.helpers.GitHubAuthorize;
import com.e.legion.test.app.helpers.InternetHelper;
import com.e.legion.test.app.helpers.SharedPreferenceManager;
import com.e.legion.test.app.interfaces.IOpenActivity;
import com.e.legion.test.app.interfaces.IReceiveToken;


public class FragmentAuthorization extends Fragment implements IReceiveToken {
    public final static String GIT_HUB_AUTHORIZE = "https://github.com/login/oauth/authorize";
    private IOpenActivity mOpenProfile;
    private WebView mWebView;
    private String mCode;

    public FragmentAuthorization() {
        setRetainInstance(true);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof IOpenActivity) {
            mOpenProfile = (IOpenActivity) activity;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_webview, container, false);
        mWebView = (WebView) root.findViewById(R.id.wv_view);
        mWebView.clearCache(true);

        boolean result = InternetHelper.isInternetEnable(getActivity());
        if (!result) {
            InternetHelper.setDownloadingError(root.findViewById(R.id.fl_webview), mWebView, root.findViewById(R.id.pb_webview));
            return root;
        }

        CookieSyncManager.createInstance(getActivity());
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookie();

        String token = SharedPreferenceManager.getAccessToken(getActivity());
        if ((token != null) && (mOpenProfile != null)) {
            mOpenProfile.openActivity(token);
            return root;
        }

        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                if (!url.startsWith("http"))
                    return;
                Uri uri = Uri.parse(url);
                mCode = uri.getQueryParameter("code");
                if (mCode != null) {
                    mWebView.setAlpha(0);
                    GitHubAuthorize.getToken(mCode, getString(R.string.client_id), getString(R.string.client_secret), FragmentAuthorization.this);
                }
            }
        });

        mWebView.loadUrl(String.format(GIT_HUB_AUTHORIZE + "?scope=%s&client_id=%s&client_secret=%s", getString(R.string.scope), getString(R.string.client_id), getString(R.string.client_secret)));

        return root;
    }

    @Override
    public void onReceiveToken(String token) {
        if (token != null) {
            SharedPreferenceManager.setAccessToken(getActivity(), token);
            if (mOpenProfile != null)
                mOpenProfile.openActivity(token);
        }
    }
}

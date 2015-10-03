package com.e.legion.test.app.helpers;

import android.util.Log;

import com.e.legion.test.app.R;
import com.e.legion.test.app.interfaces.IGitHubAuthorize;
import com.e.legion.test.app.interfaces.IReceiveToken;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.mime.TypedByteArray;

public class GitHubAuthorize {
    private static IGitHubAuthorize mAuthorization;
    public final static String GIT_HUB_AOUTH = "https://github.com/login/oauth";

    private GitHubAuthorize() {
    }

    public static IGitHubAuthorize getInstance() {
        if (mAuthorization == null) {
            RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(GIT_HUB_AOUTH).build();
            mAuthorization = restAdapter.create(IGitHubAuthorize.class);
        }
        return mAuthorization;
    }

    public static void getToken(String code, String client_id, String client_secret, final IReceiveToken receiveObject) {
        getInstance().getAccessToken(code, client_id, client_secret, new Callback<Response>() {
            @Override
            public void success(Response response, Response response2) {
                if (response.getBody() instanceof TypedByteArray) {
                    String data = new String(((TypedByteArray) response.getBody()).getBytes());
                    String token = getTokenfromData(data);
                    receiveObject.onReceiveToken(token);
                }
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e("GIT_HUB_AOUTH", "getToken: " + error.getUrl(), error);
                receiveObject.onReceiveToken(null);
            }
        });
    }

    private static String getTokenfromData(String data) {
        String[] datas = data.split("&");
        return datas[0].substring("access_token=".length());
    }

}

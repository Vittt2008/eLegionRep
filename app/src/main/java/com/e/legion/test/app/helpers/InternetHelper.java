package com.e.legion.test.app.helpers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;

import com.e.legion.test.app.R;

public class InternetHelper {
    public static boolean isInternetEnable(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] ni = cm.getAllNetworkInfo();
        boolean available = false;
        for (NetworkInfo no : ni)
            available = available | no.isConnectedOrConnecting();
        return available;
    }

    public static void setDownloadingError(View container, View... elements) {
        container.setBackgroundResource(R.drawable.ic_bg_internet);
        if (elements != null) {
            for (View view : elements)
                view.setAlpha(0);
        }
    }
}

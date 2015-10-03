package com.e.legion.test.app.helpers;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharedPreferenceManager {
    private static SharedPreferences mSettings;

    private SharedPreferenceManager() {
    }

    private static SharedPreferences getInstance(Context context) {
        if (mSettings == null) {
            mSettings = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        }
        return mSettings;
    }

    public static String getAccessToken(Context context) {
        return getInstance(context).getString("access_token", null);
    }

    public static void setAccessToken(Context context, String token) {
        SharedPreferences.Editor editor = getInstance(context).edit();
        editor.putString("access_token", token);
        editor.apply();
    }
}

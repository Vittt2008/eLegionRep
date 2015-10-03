package com.e.legion.test.app.helpers;

import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

import com.e.legion.test.app.R;


public class ToastCreator {
    public static void createSnackbar(Fragment fragment, int messageRes) {
        Snackbar snackbar = Snackbar.make(fragment.getView(), messageRes, Snackbar.LENGTH_SHORT);
        createSnackbar(snackbar);
    }

    public static void createSnackbar(Fragment fragment, String message) {
        Snackbar snackbar = Snackbar.make(fragment.getView(), message, Snackbar.LENGTH_SHORT);
        createSnackbar(snackbar);
    }

    private static void createSnackbar(Snackbar snackbar) {
        View view = snackbar.getView();
        TextView tv = (TextView) view.findViewById(android.support.design.R.id.snackbar_text);
        tv.setTextSize(14);
        TextView bt = (TextView) view.findViewById(android.support.design.R.id.snackbar_action);
        bt.setTextSize(16);
        snackbar.setAction(R.string.snackbar_ok, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        }).show();
    }
}

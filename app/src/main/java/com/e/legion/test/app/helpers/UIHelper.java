package com.e.legion.test.app.helpers;

import android.view.View;
import android.widget.ProgressBar;

public class UIHelper {
    public static void changeAlphaUI(boolean animate, ProgressBar progress, View layout) {
        if (animate) {
            progress.animate().alpha(0).setDuration(400).start();
            layout.animate().alpha(1).setDuration(500).start();
        } else {
            progress.setAlpha(0);
            layout.setAlpha(1);
        }
    }
}

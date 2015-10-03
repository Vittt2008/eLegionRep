package com.e.legion.test.app.controls;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.TextView;

public class GitHubTextView extends AppCompatTextView {
    public GitHubTextView(Context context) {
        super(context);
        Typeface typeface = Typeface.createFromAsset(getResources().getAssets(), "fonts/octicons.ttf");
        setTypeface(typeface);
    }

    public GitHubTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface typeface = Typeface.createFromAsset(getResources().getAssets(), "fonts/octicons.ttf");
        setTypeface(typeface);
    }

    public GitHubTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Typeface typeface = Typeface.createFromAsset(getResources().getAssets(), "fonts/octicons.ttf");
        setTypeface(typeface);
    }
}

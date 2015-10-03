package com.e.legion.test.app.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.e.legion.test.app.R;
import com.e.legion.test.app.fragments.FragmentProfile;
import com.e.legion.test.app.fragments.FragmentRepos;

public class AdapterPagerProfile extends FragmentPagerAdapter {
    private String mToken;
    private String[] mTabText;

    public AdapterPagerProfile(String token, FragmentManager manager, Context context) {
        super(manager);
        mToken = token;
        mTabText = new String[]{context.getString(R.string.profile), context.getString(R.string.repository)};
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return FragmentProfile.newInstance(mToken);
        else
            return FragmentRepos.newInstance(mToken);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabText[position];
    }
}

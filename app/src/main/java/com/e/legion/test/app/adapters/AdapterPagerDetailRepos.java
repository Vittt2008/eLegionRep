package com.e.legion.test.app.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.e.legion.test.app.fragments.FragmentDetailRepo;


public class AdapterPagerDetailRepos extends FragmentPagerAdapter
{
    private String mUser;
    private String[] mReposName;
    private String mToken;

    public AdapterPagerDetailRepos(String user, String[] reposName, String token, FragmentManager manager)
    {
        super(manager);
        this.mUser = user;
        this.mReposName = reposName;
        this.mToken = token;
    }

    @Override
    public Fragment getItem(int position)
    {
        return FragmentDetailRepo.newInstance(mUser, mReposName[position], mToken);
    }

    @Override
    public int getCount()
    {
        return mReposName.length;
    }

    public String getTitle(int position)
    {
        return mReposName[position];
    }
}

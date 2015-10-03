package com.e.legion.test.app.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.e.legion.test.app.R;
import com.e.legion.test.app.adapters.AdapterPagerProfile;
import com.e.legion.test.app.helpers.GitHabApi;
import com.e.legion.test.app.interfaces.IOpenActivity;
import com.e.legion.test.app.interfaces.IRepoClick;

public class ActivityGitHub extends AppCompatActivity implements IRepoClick, IOpenActivity {
    private String mToken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mToken = getIntent().getStringExtra(GitHabApi.TOKEN);

        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        AdapterPagerProfile adapter = new AdapterPagerProfile(mToken, getSupportFragmentManager(), this);
        pager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(pager);
    }

    @Override
    public void onRepoClick(String user, String[] reposName, int selectedIndex) {
        Intent intent = new Intent(this, ActivityDetailRepos.class);
        intent.putExtra(GitHabApi.USER, user);
        intent.putExtra(GitHabApi.REPOS, reposName);
        intent.putExtra(GitHabApi.TOKEN, mToken);
        intent.putExtra(GitHabApi.INDEX, selectedIndex);
        startActivity(intent);
    }

    @Override
    public void openActivity(String token) {
        Intent intent = new Intent(this, ActivityMain.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}

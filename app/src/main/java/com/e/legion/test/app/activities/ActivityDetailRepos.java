package com.e.legion.test.app.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.e.legion.test.app.R;
import com.e.legion.test.app.adapters.AdapterPagerDetailRepos;
import com.e.legion.test.app.helpers.GitHabApi;
import com.viewpagerindicator.UnderlinePageIndicator;

public class ActivityDetailRepos extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repos);

        String user = getIntent().getStringExtra(GitHabApi.USER);
        String[] repos = getIntent().getStringArrayExtra(GitHabApi.REPOS);
        String token = getIntent().getStringExtra(GitHabApi.TOKEN);
        int index = getIntent().getIntExtra(GitHabApi.INDEX, 0);
        setTitle(repos[index]);

        ViewPager pager = (ViewPager) findViewById(R.id.repos_pager);
        final AdapterPagerDetailRepos adapter = new AdapterPagerDetailRepos(user, repos, token, getSupportFragmentManager());
        pager.setAdapter(adapter);
        pager.setCurrentItem(index);

        UnderlinePageIndicator title = (UnderlinePageIndicator) findViewById(R.id.page_indicator);
        title.setViewPager(pager, index);
        title.setSelectedColor(getResources().getColor(R.color.legion_blue));

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }

            @Override
            public void onPageSelected(int position) {
                setTitle(adapter.getTitle(position));
            }
        });

    }
}

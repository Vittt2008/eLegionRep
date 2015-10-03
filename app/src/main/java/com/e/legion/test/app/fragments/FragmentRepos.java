package com.e.legion.test.app.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.e.legion.test.app.R;
import com.e.legion.test.app.adapters.AdapterRepos;
import com.e.legion.test.app.entities.Repo;
import com.e.legion.test.app.helpers.GitHabApi;
import com.e.legion.test.app.helpers.InternetHelper;
import com.e.legion.test.app.helpers.ToastCreator;
import com.e.legion.test.app.helpers.UIHelper;
import com.e.legion.test.app.interfaces.IRepoClick;
import com.e.legion.test.app.interfaces.IReceiveGitHubRepos;

import java.util.ArrayList;
import java.util.List;

public class FragmentRepos extends Fragment implements IReceiveGitHubRepos, IRepoClick {
    private RecyclerView mRecycleViewRepos;
    private RecyclerView.Adapter mAdapter;
    private IRepoClick mActivity;
    private View mContainer;

    public static FragmentRepos newInstance(String token) {
        Bundle args = new Bundle();
        args.putString(GitHabApi.TOKEN, token);
        FragmentRepos fragment = new FragmentRepos();
        fragment.setArguments(args);
        return fragment;
    }

    public FragmentRepos() {
        setRetainInstance(true);
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof IRepoClick)
            mActivity = (IRepoClick) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mContainer = inflater.inflate(R.layout.fragment_repos, container, false);
        mRecycleViewRepos = (RecyclerView) mContainer.findViewById(R.id.rv_repos);
        mRecycleViewRepos.setLayoutManager(new LinearLayoutManager(getActivity()));
        String token = getArguments().getString(GitHabApi.TOKEN);

        if (mAdapter != null)
            bindAdapter(mAdapter, false);
        else
            GitHabApi.getRepos(token, this);

        return mContainer;
    }

    private void bindAdapter(RecyclerView.Adapter adapter, boolean animate) {
        mRecycleViewRepos.setAdapter(adapter);
        changeAlphaUI(animate);
    }

    private void changeAlphaUI(boolean animate) {
        ProgressBar progress = (ProgressBar) mContainer.findViewById(R.id.pb_repos);
        UIHelper.changeAlphaUI(animate, progress, mRecycleViewRepos);
    }

    @Override
    public void onReceiveRepos(Repo[] repos) {
        if (!isVisible())
            return;
        if (repos == null) {
            ToastCreator.createSnackbar(this, R.string.repos_error);
            InternetHelper.setDownloadingError(mRecycleViewRepos);
            changeAlphaUI(true);
            return;
        }
        mAdapter = new AdapterRepos(repos, this);
        bindAdapter(mAdapter, true);
    }

    @Override
    public void onRepoClick(String user, String[] reposName, int selectedIndex) {
        if (mActivity != null)
            mActivity.onRepoClick(user, reposName, selectedIndex);
    }
}

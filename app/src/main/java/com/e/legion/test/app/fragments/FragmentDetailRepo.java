package com.e.legion.test.app.fragments;

import android.databinding.DataBindingUtil;
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
import com.e.legion.test.app.adapters.AdapterRepoAndCommits;
import com.e.legion.test.app.databinding.FragmentRepoBinding;
import com.e.legion.test.app.entities.Commit;
import com.e.legion.test.app.entities.Repo;
import com.e.legion.test.app.helpers.GitHabApi;
import com.e.legion.test.app.helpers.InternetHelper;
import com.e.legion.test.app.helpers.ToastCreator;
import com.e.legion.test.app.helpers.UIHelper;
import com.e.legion.test.app.interfaces.IReceiveGitHubRepoData;

import jp.wasabeef.recyclerview.animators.SlideInUpAnimator;

public class FragmentDetailRepo extends Fragment implements IReceiveGitHubRepoData {
    private FragmentRepoBinding mBinding;
    private Repo mRepo;
    private Commit[] mCommits;
    private AdapterRepoAndCommits mAdapter;
    private RecyclerView mRecyclerView;
    private String mRepoName;

    public static FragmentDetailRepo newInstance(String user, String repo, String token) {
        Bundle args = new Bundle();
        args.putString(GitHabApi.USER, user);
        args.putString(GitHabApi.REPO, repo);
        args.putString(GitHabApi.TOKEN, token);
        FragmentDetailRepo fragment = new FragmentDetailRepo();
        fragment.setArguments(args);
        return fragment;
    }

    public FragmentDetailRepo() {
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_repo, container, false);
        mRecyclerView = (RecyclerView) mBinding.getRoot().findViewById(R.id.rv_commits);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setItemAnimator(new SlideInUpAnimator());
        mRecyclerView.getItemAnimator().setAddDuration(500);

        String user = getArguments().getString(GitHabApi.USER);
        mRepoName = getArguments().getString(GitHabApi.REPO);
        String token = getArguments().getString(GitHabApi.TOKEN);

        if ((mRepo != null) && (mCommits != null))
            TryCreateAdapter(false);
        else {
            GitHabApi.getRepo(user, mRepoName, token, this);
            GitHabApi.getRepoCommits(user, mRepoName, token, this);
        }

        return mBinding.getRoot();
    }

    @Override
    public void onReceiveRepo(Repo repo) {
        if (!isVisible())
            return;
        if (repo == null) {
            ToastCreator.createSnackbar(this, getString(R.string.repo_detail_error) + mRepoName);
            InternetHelper.setDownloadingError(mRecyclerView);
            changeAlphaUI(true);
            return;
        }
        mRepo = repo;
        TryCreateAdapter(true);
    }

    @Override
    public void onReceiveRepoCommits(Commit[] commits) {
        if (!isVisible())
            return;
        if (commits == null)
            return;
        mCommits = commits;
        TryCreateAdapter(true);
    }

    private void TryCreateAdapter(boolean animate) {
        if ((mRepo != null) && (mCommits != null)) {
            mAdapter = new AdapterRepoAndCommits(getActivity());
            mRecyclerView.setAdapter(mAdapter);
            mAdapter.addRepo(mRepo);
            for (Commit commit : mCommits)
                mAdapter.addCommit(commit);
            changeAlphaUI(animate);
        }
    }

    private void changeAlphaUI(boolean animate) {
        ProgressBar progress = (ProgressBar) mBinding.getRoot().findViewById(R.id.pb_commits);
        UIHelper.changeAlphaUI(animate, progress, mRecyclerView);
    }
}

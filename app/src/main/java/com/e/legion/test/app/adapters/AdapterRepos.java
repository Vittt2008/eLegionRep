package com.e.legion.test.app.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.e.legion.test.app.R;
import com.e.legion.test.app.databinding.ElementRepoBinding;
import com.e.legion.test.app.entities.Repo;
import com.e.legion.test.app.interfaces.IRepoClick;

import java.util.ArrayList;
import java.util.List;

public class AdapterRepos extends RecyclerView.Adapter<AdapterRepos.ViewHolder> {
    private Repo[] mRepos;
    private String[] mReposName;
    private IRepoClick mFragment;

    public AdapterRepos(Repo[] repos, IRepoClick fragment) {
        mRepos = repos;
        List<String> reposName = new ArrayList<String>();
        for (Repo repo : mRepos)
            reposName.add(repo.name);
        mReposName = new String[reposName.size()];
        reposName.toArray(mReposName);
        mFragment = fragment;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ElementRepoBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.element_repo, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.getBinding().setRepo(mRepos[position]);
    }

    @Override
    public int getItemCount() {
        return mRepos.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ElementRepoBinding mBinding;

        private View.OnClickListener mRepoClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = getAdapterPosition();
                mFragment.onRepoClick(mRepos[0].owner.login, mReposName, index);
            }
        };

        public ViewHolder(ElementRepoBinding binding) {
            super(binding.getRoot());
            binding.getRoot().setOnClickListener(mRepoClickListener);
            mBinding = binding;
        }

        public ElementRepoBinding getBinding() {
            return mBinding;
        }
    }
}

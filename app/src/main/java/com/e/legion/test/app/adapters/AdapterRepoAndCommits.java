package com.e.legion.test.app.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.e.legion.test.app.R;
import com.e.legion.test.app.databinding.ElementCommitBinding;
import com.e.legion.test.app.databinding.HeaderRepoDetailBinding;
import com.e.legion.test.app.entities.Commit;
import com.e.legion.test.app.entities.Repo;
import com.e.legion.test.app.helpers.GitHabApi;
import com.e.legion.test.app.helpers.HeaderFooterRecyclerViewAdapter;
import com.e.legion.test.app.interfaces.IReceivePhoto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterRepoAndCommits extends HeaderFooterRecyclerViewAdapter {
    private Repo mRepo;
    private List<Commit> mCommits;
    private Context mContext;
    private DateFormat mDateFormat;

    public AdapterRepoAndCommits(Context context) {
        mCommits = new ArrayList<Commit>();
        mContext = context;
        mDateFormat = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
    }

    public void addRepo(Repo repo) {
        mRepo = repo;
        notifyHeaderItemInserted(0);
    }

    public void addCommit(Commit commit) {
        mCommits.add(commit);
        notifyContentItemInserted(mCommits.size() - 1);
    }

    //region Header Repo
    @Override
    protected int getHeaderItemCount() {
        return (mRepo != null) ? 1 : 0;
    }

    @Override
    protected RecyclerView.ViewHolder onCreateHeaderItemViewHolder(ViewGroup parent, int headerViewType) {
        HeaderRepoDetailBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.header_repo_detail, parent, false);
        return new ViewHolderRepo(binding);
    }

    @Override
    protected void onBindHeaderItemViewHolder(RecyclerView.ViewHolder headerViewHolder, int position) {
        ViewHolderRepo holder = (ViewHolderRepo) headerViewHolder;
        holder.getBinding().setRepo(mRepo);
        if (mRepo != null) {
            holder.getPhotoView().animate().alpha(1).setDuration(500).start();
            GitHabApi.downloadPhoto(mContext, mRepo.owner.avatar_url, holder.getPhotoView(), holder);
        }
    }
    //endregion

    //region Content Commits
    @Override
    protected int getContentItemCount() {
        return mCommits.size();
    }

    @Override
    protected RecyclerView.ViewHolder onCreateContentItemViewHolder(ViewGroup parent, int contentViewType) {
        ElementCommitBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.element_commit, parent, false);
        return new ViewHolderCommit(binding);
    }

    @Override
    protected void onBindContentItemViewHolder(RecyclerView.ViewHolder contentViewHolder, int position) {
        ViewHolderCommit holder = (ViewHolderCommit) contentViewHolder;
        holder.getBinding().setCommit(mCommits.get(position));
        holder.getBinding().setDateFormat(mDateFormat);
        if (mCommits.get(position).committer != null)
            GitHabApi.downloadPhoto(mContext, mCommits.get(position).committer.avatar_url, holder.getPhotoView(), holder);

    }
    //endregion

    //region Footer Not USe
    @Override
    protected int getFooterItemCount() {
        return 0;
    }

    @Override
    protected RecyclerView.ViewHolder onCreateFooterItemViewHolder(ViewGroup parent, int footerViewType) {
        return null;
    }

    @Override
    protected void onBindFooterItemViewHolder(RecyclerView.ViewHolder footerViewHolder, int position) {

    }
    //endregion

    public class ViewHolderCommit extends RecyclerView.ViewHolder implements IReceivePhoto {
        private ElementCommitBinding mBinding;
        private ImageView mCommitAuthorPhoto;

        public ViewHolderCommit(ElementCommitBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
            mCommitAuthorPhoto = (ImageView) binding.getRoot().findViewById(R.id.iv_commit_author);
        }

        public ElementCommitBinding getBinding() {
            return mBinding;
        }

        public ImageView getPhotoView() {
            return mCommitAuthorPhoto;
        }

        @Override
        public void onDownloadedPhoto(boolean success) {
        }
    }

    public class ViewHolderRepo extends RecyclerView.ViewHolder implements IReceivePhoto {
        private HeaderRepoDetailBinding mBinding;
        private ImageView mCommitAuthorPhoto;

        public ViewHolderRepo(HeaderRepoDetailBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
            mCommitAuthorPhoto = (ImageView) binding.getRoot().findViewById(R.id.iv_author_photo);
        }

        public HeaderRepoDetailBinding getBinding() {
            return mBinding;
        }

        public ImageView getPhotoView() {
            return mCommitAuthorPhoto;
        }

        @Override
        public void onDownloadedPhoto(boolean success) {
        }
    }
}

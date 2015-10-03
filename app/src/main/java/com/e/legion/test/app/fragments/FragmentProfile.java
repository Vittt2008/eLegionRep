package com.e.legion.test.app.fragments;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.e.legion.test.app.R;
import com.e.legion.test.app.databinding.FragmentProfileBinding;
import com.e.legion.test.app.entities.User;
import com.e.legion.test.app.helpers.GitHabApi;
import com.e.legion.test.app.helpers.InternetHelper;
import com.e.legion.test.app.helpers.SharedPreferenceManager;
import com.e.legion.test.app.helpers.ToastCreator;
import com.e.legion.test.app.helpers.UIHelper;
import com.e.legion.test.app.interfaces.IOpenActivity;
import com.e.legion.test.app.interfaces.IReceiveGitHubData;

public class FragmentProfile extends Fragment implements IReceiveGitHubData {
    private FragmentProfileBinding mBinding;
    private User mUser;
    private IOpenActivity mOpenMainActivity;

    public static FragmentProfile newInstance(String token) {
        Bundle args = new Bundle();
        args.putString(GitHabApi.TOKEN, token);
        FragmentProfile fragment = new FragmentProfile();
        fragment.setArguments(args);
        return fragment;
    }

    public FragmentProfile() {
        setRetainInstance(true);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof IOpenActivity)
            mOpenMainActivity = (IOpenActivity) activity;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false);
        String token = getArguments().getString(GitHabApi.TOKEN);

        if (mUser != null)
            bindUser(mUser, false);
        else
            GitHabApi.getUserInfo(token, this);

        findButton(mBinding.getRoot());

        return mBinding.getRoot();
    }

    @Override
    public void onReceiveUserInfo(User user) {
        if (!isVisible())
            return;
        if (user == null) {
            ToastCreator.createSnackbar(this, R.string.profile_error);
            InternetHelper.setDownloadingError(mBinding.getRoot().findViewById(R.id.ll_profile));
            changeAlphaUI(true);
            return;
        }
        mUser = user;
        bindUser(user, true);
    }

    @Override
    public void onDownloadedPhoto(boolean success) {

    }

    private void bindUser(User user, boolean animate) {
        mBinding.setUser(user);
        ImageView image = (ImageView) mBinding.getRoot().findViewById(R.id.iv_photo);
        image.animate().alpha(1).setDuration(500).start();
        GitHabApi.downloadPhoto(getActivity(), user.avatar_url, image, this);
        changeAlphaUI(animate);

    }

    private void changeAlphaUI(boolean animate) {
        ProgressBar progress = (ProgressBar) mBinding.getRoot().findViewById(R.id.pb_uer_profile);
        View include = mBinding.getRoot().findViewById(R.id.ll_profile);
        UIHelper.changeAlphaUI(animate, progress, include);
    }

    private void findButton(View root) {
        Button button = (Button) root.findViewById(R.id.bt_exit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferenceManager.setAccessToken(getActivity(), null);
                if (mOpenMainActivity != null)
                    mOpenMainActivity.openActivity(null);
            }
        });
    }
}

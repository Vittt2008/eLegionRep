package com.e.legion.test.app.activities;

import android.content.Intent;
import android.support.v4.app.Fragment;

import com.e.legion.test.app.fragments.FragmentAuthorization;
import com.e.legion.test.app.helpers.BaseActivity;
import com.e.legion.test.app.helpers.GitHabApi;
import com.e.legion.test.app.interfaces.IOpenActivity;

public class ActivityMain extends BaseActivity implements IOpenActivity {
    @Override
    protected Fragment createFragment() {
        return new FragmentAuthorization();
    }

    @Override
    protected String getFragmentName() {
        return "fragment_authorization";
    }

    @Override
    public void openActivity(String token) {
        Intent intent = new Intent(this, ActivityGitHub.class);
        intent.putExtra(GitHabApi.TOKEN, token);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}

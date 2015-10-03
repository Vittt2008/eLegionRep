package com.e.legion.test.app.helpers;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;

import com.e.legion.test.app.R;
import com.e.legion.test.app.entities.Commit;
import com.e.legion.test.app.entities.Repo;
import com.e.legion.test.app.entities.User;
import com.e.legion.test.app.interfaces.IGitHubApi;
import com.e.legion.test.app.interfaces.IReceiveGitHubData;
import com.e.legion.test.app.interfaces.IReceiveGitHubRepoData;
import com.e.legion.test.app.interfaces.IReceiveGitHubRepos;
import com.e.legion.test.app.interfaces.IReceivePhoto;
import com.squareup.picasso.Picasso;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class GitHabApi {
    private static IGitHubApi mApi;
    private final static String GIT_HUB_API = "https://api.github.com";
    public static final String TOKEN = "token";
    public static final String USER = "user";
    public static final String REPO = "repo";
    public static final String REPOS = "repos";
    public static final String INDEX = "index";

    private static final String TAG = "GIT_HUB_API";

    private GitHabApi() {
    }

    public static IGitHubApi getInstance() {
        if (mApi == null) {
            RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(GIT_HUB_API).build();
            mApi = restAdapter.create(IGitHubApi.class);
        }
        return mApi;
    }

    public static void getUserInfo(String token, final IReceiveGitHubData receiveObject) {
        getInstance().getUserInfo(token, new Callback<User>() {
            @Override
            public void success(User user, Response response) {
                receiveObject.onReceiveUserInfo(user);
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e(TAG, "getUserInfo: " + error.getUrl(), error);
                receiveObject.onReceiveUserInfo(null);
            }
        });
    }

    public static void downloadPhoto(Context context, String image_url, ImageView image, final IReceivePhoto receiveObject) {
        Picasso.with(context)
                .load(image_url)
                .placeholder(R.drawable.github_photo)
                .error(R.drawable.github_photo)
                .into(image, new com.squareup.picasso.Callback() {
                    @Override
                    public void onSuccess() {
                        receiveObject.onDownloadedPhoto(true);
                    }

                    @Override
                    public void onError() {
                        receiveObject.onDownloadedPhoto(false);
                    }
                });
    }

    public static void getRepos(String token, final IReceiveGitHubRepos receiveObject) {
        getInstance().getUserRepos(token, new Callback<Repo[]>() {
            @Override
            public void success(Repo[] repos, Response response) {
                receiveObject.onReceiveRepos(repos);
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e(TAG, "getRepos: " + error.getUrl(), error);
                        receiveObject.onReceiveRepos(null);
            }
        });
    }

    public static void getRepo(String user, String repo, String token, final IReceiveGitHubRepoData receiveObject) {
        getInstance().getUserRepo(user, repo, token, new Callback<Repo>() {
            @Override
            public void success(Repo repo, Response response) {
                receiveObject.onReceiveRepo(repo);
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e(TAG, "getRepo: " + error.getUrl(), error);
                        receiveObject.onReceiveRepo(null);
            }
        });
    }

    public static void getRepoCommits(String user, String repo, String token, final IReceiveGitHubRepoData receiveObject) {
        getInstance().getRepoCommits(user, repo, token, new Callback<Commit[]>() {
            @Override
            public void success(Commit[] commits, Response response) {
                receiveObject.onReceiveRepoCommits(commits);
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e(TAG, "getRepoCommits: " + error.getUrl(), error);
                receiveObject.onReceiveRepoCommits(new Commit[0]);
            }
        });
    }
}

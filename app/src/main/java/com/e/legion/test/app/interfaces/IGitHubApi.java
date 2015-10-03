package com.e.legion.test.app.interfaces;

import com.e.legion.test.app.entities.Commit;
import com.e.legion.test.app.entities.Repo;
import com.e.legion.test.app.entities.User;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface IGitHubApi {
    @GET("/user")
    void getUserInfo(@Query("access_token") String access_token, Callback<User> callback);

    @GET("/user/repos")
    void getUserRepos(@Query("access_token") String access_token, Callback<Repo[]> callback);

    @GET("/repos/{user}/{repo}")
    void getUserRepo(@Path("user") String user, @Path("repo") String repo, @Query("access_token") String access_token, Callback<Repo> callback);

    @GET("/repos/{user}/{repo}/commits")
    void getRepoCommits(@Path("user") String user, @Path("repo") String repo, @Query("access_token") String access_token, Callback<Commit[]> callback);
}

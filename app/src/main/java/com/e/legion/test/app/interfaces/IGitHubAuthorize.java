package com.e.legion.test.app.interfaces;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Query;

public interface IGitHubAuthorize {
    @GET("/access_token")
    void getAccessToken(@Query("code") String code, @Query("client_id") String client_id, @Query("client_secret") String client_secret, Callback<Response> callback);
}

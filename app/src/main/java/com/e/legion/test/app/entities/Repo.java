package com.e.legion.test.app.entities;

import com.google.gson.annotations.SerializedName;

public class Repo {
    public String id;
    public String name;
    public String full_name;
    @SerializedName("private")
    public boolean is_private;
    public String html_url;
    public String description;
    public boolean fork;
    public int forks;
    public int watchers;

    public User owner;

    //Detail
    @SerializedName("stargazers_count")
    public int stars;
    public String language;
    public Repo parent;
    public Repo source;
    @SerializedName("subscribers_count")
    public int watches;
}

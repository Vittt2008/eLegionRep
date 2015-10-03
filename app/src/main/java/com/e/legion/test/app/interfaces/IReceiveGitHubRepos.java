package com.e.legion.test.app.interfaces;


import com.e.legion.test.app.entities.Repo;

public interface IReceiveGitHubRepos {
    void onReceiveRepos(Repo[] repos);
}

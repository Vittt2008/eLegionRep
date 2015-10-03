package com.e.legion.test.app.interfaces;

import com.e.legion.test.app.entities.Commit;
import com.e.legion.test.app.entities.Repo;

public interface IReceiveGitHubRepoData {
    void onReceiveRepo(Repo repo);

    void onReceiveRepoCommits(Commit[] commits);
}

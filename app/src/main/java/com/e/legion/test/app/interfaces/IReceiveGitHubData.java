package com.e.legion.test.app.interfaces;

import com.e.legion.test.app.entities.Repo;
import com.e.legion.test.app.entities.User;

public interface IReceiveGitHubData extends IReceivePhoto {
    void onReceiveUserInfo(User user);
}

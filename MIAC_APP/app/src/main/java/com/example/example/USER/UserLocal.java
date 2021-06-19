package com.example.example.USER;

import com.example.example.model.User;

public class UserLocal {

    private static User localUser;

    public static User getLocalUser() {
        return localUser;
    }

    public static void setLocalUser(User localUser) {
        UserLocal.localUser = localUser;
    }
}

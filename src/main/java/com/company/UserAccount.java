package com.company;

import java.util.UUID;

public class UserAccount implements Account{
    public UserAccount(String userName, UUID userID) {
        this.userName = userName;
        this.userID = userID;
    }

    String userName;
    UUID userID;
    @Override
    public String getUserName() {
        return this.userName;
    }

    @Override
    public UUID getUserID() {
        return this.userID;
    }
}

package com.memes.models;

import com.memes.dynamodb.models.User;

public class UserModel {
    private String userName;
    private String email;

    public UserModel(){

    }
    public UserModel(UserModel.Builder builder) {
        this.userName = builder.userName;
        this.email = builder.email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public static UserModel.Builder builder() { return new UserModel.Builder(); }

    public static final class Builder {
        private String userName;
        private String email;

        public UserModel.Builder withUserName(String userNameToUse) {
            this.userName = userNameToUse;
            return this;
        }

        public UserModel.Builder withEmail(String emailToUse) {
            this.email = emailToUse;
            return this;
        }

        public UserModel build() {return new UserModel(this);}
    }
}

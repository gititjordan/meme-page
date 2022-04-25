package com.memes.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;

public class MemeLikedList {
    private String email;
    private String url;

    @DynamoDBHashKey(attributeName = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @DynamoDBAttribute(attributeName = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String name) {
        this.url = url;
    }
}

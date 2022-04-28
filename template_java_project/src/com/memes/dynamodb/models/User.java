package com.memes.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.List;

@DynamoDBTable(tableName = "Users")
public class User {
    private String userName;
    private String email;
    private List<String> memeLikedList;

    @DynamoDBHashKey(attributeName = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @DynamoDBAttribute(attributeName = "userName")
    public String getUserName() {
        return userName;
    }

    @DynamoDBAttribute(attributeName = "memeLikedList")
    public List<String> getMemeLikedList() {
        return memeLikedList;
    }

    public void setMemeLikedList(List<String> memeLikedList) {
        this.memeLikedList = memeLikedList;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
package com.memes.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

@DynamoDBTable(tableName = "Memes")
public class Meme {
    private String url;
    private String name;
    private Integer index;
    @DynamoDBHashKey(attributeName = "Url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @DynamoDBIndexHashKey(globalSecondaryIndexName = "index-index", attributeName = "index")
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @DynamoDBAttribute(attributeName = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
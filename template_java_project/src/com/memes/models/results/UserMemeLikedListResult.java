package com.memes.models.results;

import com.memes.models.MemeModel;

import java.util.List;

public class GetUserMemeLikedListResult {
    private List<String> memeLikedList;

    public GetUserMemeLikedListResult(GetUserMemeLikedListResult.Builder builder) {
        this.memeLikedList = builder.memeLikedList;
    }

    public List<String> getMemeLikedList() {
        return memeLikedList;
    }

    public void setMemeLikedList(List<String> memeLikedList) {
        this.memeLikedList = memeLikedList;
    }

    public static GetUserMemeLikedListResult.Builder builder() {return new GetUserMemeLikedListResult.Builder();}

    public static final class Builder {
        private List<String> memeLikedList;

        public GetUserMemeLikedListResult.Builder withUserMemeLikedList(List<String> memeLikedList) {
            this.memeLikedList = memeLikedList;
            return this;
        }

        public GetUserMemeLikedListResult build() {return new GetUserMemeLikedListResult(this);}
    }
}

package com.memes.models.requests;

import com.amazonaws.services.dynamodbv2.model.Get;
import com.memes.activity.GetIndexMemeActivity;

import java.util.Objects;

public class GetIndexMemeRequest {
    private Integer index;

    public GetIndexMemeRequest() {

    }

    public GetIndexMemeRequest(Builder builder) {
        this.index = builder.index;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetIndexMemeRequest that = (GetIndexMemeRequest) o;
        return Objects.equals(index, that.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index);
    }

    @Override
    public String toString() {
        return "GetPlaylistRequest{" +
                "index='" + index + '\'' +
                '}';
    }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {
        private Integer index;

        private Builder() {

        }

        public Builder withIndex(Integer index) {
            this.index = index;
            return this;
        }

        public GetIndexMemeRequest build() { return new GetIndexMemeRequest(this); }
    }
}

package com.memes.models.results;

import com.memes.models.requests.GetIndexMemeRequest;

import java.util.Objects;

public class GetIndexMemeResult {
    private String url;
    
    public GetIndexMemeResult() {

    }

    public GetIndexMemeResult(GetIndexMemeResult.Builder builder) {
        this.url = builder.url;
    }

    public String getUrl() {
        return url;
    }

    public void SetUrl(String index) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetIndexMemeResult that = (GetIndexMemeResult) o;
        return Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url);
    }

    @Override
    public String toString() {
        return "GetPlaylistResult{" +
                "url='" + url + '\'' +
                '}';
    }

    public static GetIndexMemeResult.Builder builder() { return new GetIndexMemeResult.Builder(); }

    public static final class Builder {
        private String url;

        private Builder() {

        }

        public GetIndexMemeResult.Builder withIndex(Integer index) {
            this.url = url;
            return this;
        }

        public GetIndexMemeResult build() { return new GetIndexMemeResult(this); }
    }
}

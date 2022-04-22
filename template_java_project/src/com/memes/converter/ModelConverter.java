package com.memes.converter;

import com.memes.dynamodb.models.Meme;
import com.memes.models.MemeModel;


public class ModelConverter {
    public MemeModel toMemeModel(Meme meme) {
        return MemeModel.builder()
                .withNumInDb(meme.getNumInDb())
                .withName(meme.getName())
                .withUrl(meme.getUrl())
                .build();
    }
}

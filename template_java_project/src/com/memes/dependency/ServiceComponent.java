package com.memes.dependency;
import com.memes.activity.GetIndexMemeActivity;
import com.memes.activity.GetRandomMemeActivity;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {DaoModule.class})
public interface ServiceComponent {
    GetIndexMemeActivity provideGetIndexMemeActivity();
//    GetRandomMemeActivity provideGetRandomMemeActivity();

}

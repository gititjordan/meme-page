package com.memes.dependency;
import com.memes.activity.GetIndexMemeActivity;
import com.memes.activity.GetRandomMemeActivity;
import com.memes.activity.GetUrlMemeActivity;
import com.memes.activity.UserPoolMapperActivity;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {DaoModule.class})
public interface ServiceComponent {
    GetIndexMemeActivity provideGetIndexMemeActivity();
    GetUrlMemeActivity provideGetUrlMemeActivity();
//    GetRandomMemeActivity provideGetRandomMemeActivity();
    UserPoolMapperActivity provideUserPoolMapperActivity();

}

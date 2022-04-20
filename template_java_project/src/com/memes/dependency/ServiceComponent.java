package com.memes.dependency;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {DaoModule.class})
public interface ServiceComponent {

}

package com.protocol10.playground.di;

import android.app.Application;
import android.content.Context;

import com.protocol10.playground.MainActivity;
import com.protocol10.playground.ui.UserListActivity;

import org.jetbrains.annotations.NotNull;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {

    void inject(@NotNull MainActivity mainActivity);

    void inject(@NotNull UserListActivity activity);


    @Component.Builder
    interface Builder {
        AppComponent build();

        @BindsInstance
        Builder appModule(Context context);
    }
}

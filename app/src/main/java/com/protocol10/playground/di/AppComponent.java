package com.protocol10.playground.di;

import android.app.Application;
import android.content.Context;

import com.protocol10.playground.MainActivity;
import com.protocol10.playground.MainActivityModule;
import com.protocol10.playground.PlayApp;
import com.protocol10.playground.ui.UserListActivity;

import org.jetbrains.annotations.NotNull;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class,
        AppModule.class,
        NetworkModule.class,
        MainActivityModule.class})
public interface AppComponent {

    void inject(@NotNull MainActivity mainActivity);

    void inject(@NotNull UserListActivity activity);

    void inject(PlayApp app);

    @Component.Builder
    interface Builder {
        AppComponent build();

        @BindsInstance
        Builder appModule(Context context);
    }
}

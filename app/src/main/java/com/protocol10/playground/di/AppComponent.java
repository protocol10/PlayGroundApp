package com.protocol10.playground.di;

import android.content.Context;

import com.protocol10.playground.MainActivity;
import com.protocol10.playground.ui.UserListActivity;

import org.jetbrains.annotations.NotNull;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {


    Context getContext();

    void inject(@NotNull MainActivity mainActivity);

    void inject(@NotNull UserListActivity activity);
}

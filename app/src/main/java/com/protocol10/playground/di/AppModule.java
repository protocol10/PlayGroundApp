package com.protocol10.playground.di;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    public SharedPreferences providesSharedPref(Context context, Gson gson) {
        return context.getSharedPreferences("ABC", Context.MODE_PRIVATE);
    }
}

package com.protocol10.playground;

import android.app.Application;

import com.protocol10.playground.di.AppComponent;
import com.protocol10.playground.di.AppModule;
import com.protocol10.playground.di.DaggerAppComponent;


public class PlayApp extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();

    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}

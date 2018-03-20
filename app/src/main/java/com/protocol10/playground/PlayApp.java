package com.protocol10.playground;

import android.app.Activity;
import android.app.Application;

import com.protocol10.playground.di.AppComponent;
import com.protocol10.playground.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;


public class PlayApp extends Application implements HasActivityInjector {

    AppComponent appComponent;

    @Inject
    DispatchingAndroidInjector<Activity> injector;

    @Override
    public void onCreate() {
        super.onCreate();

//        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        appComponent = DaggerAppComponent.builder().appModule(this).build();
        appComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return injector;
    }
}

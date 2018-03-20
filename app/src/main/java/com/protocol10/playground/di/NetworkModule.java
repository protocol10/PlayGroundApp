package com.protocol10.playground.di;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.protocol10.playground.R;
import com.protocol10.playground.RandomUserService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {


    @Provides
    @Singleton
    Gson providesGson() {
        return new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").create();
    }

    @Provides
    @Singleton
    public Retrofit providesRetrofit(Context context, Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder().baseUrl(context.getString(R.string.api_random_user))
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }


    @Provides
    @Singleton
    public OkHttpClient providesOkHttpClient(HttpLoggingInterceptor interceptor) {
        return new OkHttpClient.Builder().addInterceptor(interceptor).build();
    }

    @Provides
    @Singleton
    public HttpLoggingInterceptor providesLoggingInterceptor() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        return interceptor;
    }


    @Provides
    @Singleton
    public RandomUserService providesNetworkService(Retrofit retrofit) {
        return retrofit.create(RandomUserService.class);
    }
}

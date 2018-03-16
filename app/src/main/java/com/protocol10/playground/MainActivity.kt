package com.protocol10.playground

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var context: Context;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (applicationContext is PlayApp) {
            (applicationContext as PlayApp).getAppComponent().inject(this)

        }
    }
}
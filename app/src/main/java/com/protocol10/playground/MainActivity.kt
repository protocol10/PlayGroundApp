package com.protocol10.playground

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.protocol10.playground.ui.UserListActivity
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

        findViewById<TextView>(R.id.text_view).setOnClickListener { startActivity(Intent(this@MainActivity, UserListActivity::class.java)) }
    }
}
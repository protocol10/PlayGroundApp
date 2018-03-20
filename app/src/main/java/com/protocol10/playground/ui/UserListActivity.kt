package com.protocol10.playground.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.protocol10.playground.PlayApp
import com.protocol10.playground.R
import com.protocol10.playground.RandomUserService
import javax.inject.Inject

class UserListActivity : AppCompatActivity() {

    @Inject lateinit var networkService: RandomUserService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_list)
        (applicationContext as PlayApp).appComponent.inject(this);
        val presenter =UserListPresenter(networkService);
        presenter.retrieveListOfUsers()
    }
}

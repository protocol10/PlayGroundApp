package com.protocol10.playground.ui

import android.util.Log.i
import com.protocol10.playground.RandomUserService

class UserListPresenter(val networkService: RandomUserService) {

    fun retrieveListOfUsers() {
        i(UserListPresenter::class.java.name, "Users are loaded")
    }
}



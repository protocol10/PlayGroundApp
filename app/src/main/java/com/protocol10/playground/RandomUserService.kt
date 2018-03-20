package com.protocol10.playground

import com.protocol10.playground.model.UserDataModel
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.Single

interface RandomUserService {

    fun getUserData(): Flowable<UserDataModel>
}
package com.protocol10.playground

import com.protocol10.playground.model.UserDataModel
import io.reactivex.Observable

interface RandomUserService {

    fun getUserData(): Observable<UserDataModel>
}
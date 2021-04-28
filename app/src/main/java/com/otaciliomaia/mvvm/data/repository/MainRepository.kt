package com.otaciliomaia.mvvm.data.repository

import com.otaciliomaia.mvvm.data.api.ApiHelper
import com.otaciliomaia.mvvm.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}
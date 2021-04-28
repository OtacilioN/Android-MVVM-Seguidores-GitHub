package com.otaciliomaia.mvvm.data.api

import com.otaciliomaia.mvvm.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}
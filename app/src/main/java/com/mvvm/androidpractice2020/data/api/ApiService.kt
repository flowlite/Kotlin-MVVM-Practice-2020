package com.mvvm.androidpractice2020.data.api

import com.mvvm.androidpractice2020.data.model.User
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("/users")
    fun getUsers(): Single<List<User>>

}
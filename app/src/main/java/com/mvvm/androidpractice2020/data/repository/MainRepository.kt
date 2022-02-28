package com.mvvm.androidpractice2020.data.repository

import com.mvvm.androidpractice2020.data.api.ApiHelper
import com.mvvm.androidpractice2020.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getApiService().getUsers()
    }

}
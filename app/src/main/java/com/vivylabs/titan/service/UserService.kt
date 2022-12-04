package com.vivylabs.titan.service

import com.vivylabs.titan.model.ResponseModel
import com.vivylabs.titan.model.UserModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface UserService {
    @GET("api/v1/users/{id}")
    suspend fun findOne(@Path("id") id: Int) : Response<ResponseModel<UserModel>>
}
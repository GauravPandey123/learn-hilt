package com.krishaantechnology.learnhiltdi.network

import com.krishaantechnology.learnhiltdi.network.requests.LoginRequest
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserServices {

    @POST("/api/v1/login")
    suspend fun login(@Body loginRequest: LoginRequest): Response<Any>
}
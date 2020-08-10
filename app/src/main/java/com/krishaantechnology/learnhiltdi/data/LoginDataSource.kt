package com.krishaantechnology.learnhiltdi.data

import com.krishaantechnology.learnhiltdi.data.model.LoggedInUser
import com.krishaantechnology.learnhiltdi.network.UserServices
import com.krishaantechnology.learnhiltdi.network.requests.LoginRequest
import java.io.IOException
import javax.inject.Inject

class LoginDataSource @Inject constructor(private val userServices: UserServices) {

    suspend fun login(username: String, password: String): Result<LoggedInUser> {
        return try {

            val loginResult = userServices.login(LoginRequest(username, password))

            val fakeUser = LoggedInUser(java.util.UUID.randomUUID().toString(), "Jane Doe")
            return Result.Success(fakeUser)
        } catch (e: Throwable) {
            Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}
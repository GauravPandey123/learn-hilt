package com.krishaantechnology.learnhiltdi.modules

import com.krishaantechnology.learnhiltdi.data.LoginDataSource
import com.krishaantechnology.learnhiltdi.network.UserServices
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object DataSourceModule {

    @Provides
    @Singleton
    fun providesLoginDataSource(userServices: UserServices) = LoginDataSource(userServices)
}
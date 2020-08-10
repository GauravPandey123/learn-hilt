package com.krishaantechnology.learnhiltdi.modules

import com.krishaantechnology.learnhiltdi.network.ServiceBuilder
import com.krishaantechnology.learnhiltdi.network.UserServices
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object ServicesModule {

    @Provides
    @Singleton
    fun provideUserService(serviceBuilder: ServiceBuilder): UserServices = serviceBuilder.buildService(UserServices::class.java)
}
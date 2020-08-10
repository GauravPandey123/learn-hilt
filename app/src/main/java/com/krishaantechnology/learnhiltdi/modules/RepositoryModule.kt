package com.krishaantechnology.learnhiltdi.modules

import com.krishaantechnology.learnhiltdi.data.LoginDataSource
import com.krishaantechnology.learnhiltdi.data.LoginRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun providesLoginRepository(loginDataSource: LoginDataSource)
            = LoginRepository(loginDataSource)
}
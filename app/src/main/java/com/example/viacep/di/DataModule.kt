package com.example.viacep.di

import com.example.viacep.data.api.ServiceApi
import com.example.viacep.network.ServiceProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DataModule {

    @Provides
    @Singleton
    fun providesServiceApi(
        serviceProvider: ServiceProvider
    ): ServiceApi {
        return serviceProvider.createService(ServiceApi::class.java)
    }

}
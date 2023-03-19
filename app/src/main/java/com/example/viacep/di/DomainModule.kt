package com.example.viacep.di

import com.example.viacep.data.repository.AddressRepositoryImpl
import com.example.viacep.domain.repository.AddressRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class DomainModule {

    @Binds
    abstract fun bindsAddressRepositoryImpl(
        addressRepositoryImpl: AddressRepositoryImpl
    ): AddressRepository

}
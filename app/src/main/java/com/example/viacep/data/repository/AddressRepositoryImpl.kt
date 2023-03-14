package com.example.viacep.data.repository

import com.example.viacep.data.api.ServiceApi
import com.example.viacep.data.model.AddressResponse
import com.example.viacep.domain.repository.AddressRepository

class AddressRepositoryImpl(
    private val service: ServiceApi
) : AddressRepository {

    override suspend fun getAddress(cep: String): AddressResponse {
        return service.getAddress(cep)
    }
}
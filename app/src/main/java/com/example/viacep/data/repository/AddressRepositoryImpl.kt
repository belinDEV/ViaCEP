package com.example.viacep.data.repository

import com.example.viacep.data.api.ServiceApi
import com.example.viacep.data.model.AddressResponse
import com.example.viacep.domain.repository.AddressRepository
import javax.inject.Inject

class AddressRepositoryImpl @Inject constructor(
    private val service: ServiceApi
) : AddressRepository {

    override suspend fun getAddress(cep: String): AddressResponse {
        return service.getAddress(cep)
    }
}
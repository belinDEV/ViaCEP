package com.example.viacep.domain.repository

import com.example.viacep.data.model.AddressResponse

interface AddressRepository {

    suspend fun getAddress(cep: String): AddressResponse

}
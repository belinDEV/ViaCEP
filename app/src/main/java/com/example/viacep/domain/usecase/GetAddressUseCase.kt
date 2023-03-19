package com.example.viacep.domain.usecase

import com.example.viacep.data.mapper.toDomain
import com.example.viacep.domain.model.Address
import com.example.viacep.domain.repository.AddressRepository
import javax.inject.Inject

class GetAddressUseCase @Inject constructor(
    private val repository: AddressRepository
) {

    suspend operator fun invoke(cep: String): Address {
        return repository.getAddress(cep).toDomain()
    }

}
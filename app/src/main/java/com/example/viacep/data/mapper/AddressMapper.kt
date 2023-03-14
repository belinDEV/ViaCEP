package com.example.viacep.data.mapper

import com.example.viacep.data.model.AddressResponse
import com.example.viacep.domain.model.Address

fun AddressResponse.toDomain(): Address {
    return Address(
        cep = cep,
        logradouro = logradouro,
        complemento = complemento,
        bairro = bairro,
        localidade = localidade,
        uf = uf,
        ddd = ddd
    )
}
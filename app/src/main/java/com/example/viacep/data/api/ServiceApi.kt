package com.example.viacep.data.api

import com.example.viacep.data.model.AddressResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ServiceApi {

    @GET("{cep}/json")
    suspend fun getAddress(
        @Path("cep") cep: String
    ): AddressResponse

}
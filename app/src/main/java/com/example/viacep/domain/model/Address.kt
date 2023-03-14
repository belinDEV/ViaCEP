package com.example.viacep.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Address(
    val cep: String?,
    val logradouro: String?,
    val complemento: String?,
    val bairro: String?,
    val localidade: String?,
    val uf: String?,
    val ddd: String?,
): Parcelable


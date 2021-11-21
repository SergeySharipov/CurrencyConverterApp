package ca.sharipov.currencyconverterapp.data.model

import kotlinx.serialization.Serializable

@Serializable
data class CurrencyResponse(
    val base: String,
    val date: String,
    val rates: MutableMap<String, Double>,
    val success: Boolean,
    val timestamp: Int
)
package ca.sharipov.currencyconverterapp.data

import ca.sharipov.currencyconverterapp.data.model.CurrencyResponse
import io.ktor.client.*
import io.ktor.client.request.*
import javax.inject.Inject

class CurrencyApi @Inject constructor(private val client: HttpClient) {

    suspend fun getRates(): CurrencyResponse = client.get("/latest")
}
package ca.sharipov.currencyconverterapp.data

import ca.sharipov.currencyconverterapp.data.model.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET

interface CurrencyApi {

    @GET("/latest")
    suspend fun getRates(): Response<CurrencyResponse>
}
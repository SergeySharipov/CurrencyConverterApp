package ca.sharipov.currencyconverterapp.repository

import ca.sharipov.currencyconverterapp.data.model.CurrencyResponse
import ca.sharipov.currencyconverterapp.util.Resource

interface MainRepository {

    suspend fun getRates():Resource<CurrencyResponse>
}
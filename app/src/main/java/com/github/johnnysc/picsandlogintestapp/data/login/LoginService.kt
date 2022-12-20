package com.github.johnnysc.picsandlogintestapp.data.login

import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Сервис для логина
 *

 **/
interface LoginService {

    @GET("weather")
    suspend fun getWeatherAsync(
        @Query("id") cityId: Int = 498817,
        @Query("lang") lang: String = "ru",
        @Query("units") units: String = "metric"
    ): WeatherDTO
}
package com.github.johnnysc.picsandlogintestapp.domain.login

import com.github.johnnysc.picsandlogintestapp.data.login.WeatherDTO

/**
 * Репозиторий для логина
 *

 **/
interface LoginRepository {

    suspend fun getWeather(): WeatherDTO
}
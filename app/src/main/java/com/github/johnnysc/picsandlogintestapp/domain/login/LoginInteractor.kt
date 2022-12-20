package com.github.johnnysc.picsandlogintestapp.domain.login

/**
 * Интерактор для логина
 *

 **/
interface LoginInteractor {

    suspend fun login(): WeatherItem
}
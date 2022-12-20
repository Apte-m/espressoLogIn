package com.github.johnnysc.picsandlogintestapp.data.login

import com.github.johnnysc.picsandlogintestapp.domain.login.LoginRepository

/**
 * Основная реализация репозитория логина
 *

 **/
class LoginRepositoryImpl(private val service: LoginService) : LoginRepository {

    override suspend fun getWeather() = service.getWeatherAsync()
}
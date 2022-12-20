package com.github.johnnysc.picsandlogintestapp.domain.login

import com.github.johnnysc.picsandlogintestapp.core.ExceptionHandler
import com.github.johnnysc.picsandlogintestapp.core.Mapper
import com.github.johnnysc.picsandlogintestapp.data.login.WeatherDTO
import java.lang.Exception

/**
 * Основная реализация интерактора для логина

 **/
class LoginInteractorImpl(
    private val repository: LoginRepository,
    private val mapper: Mapper<WeatherItem, WeatherDTO>,
    private val exceptionHandler: ExceptionHandler
) : LoginInteractor {

    override suspend fun login() = try {
        mapper.map(repository.getWeather())
    } catch (e: Exception) {
        WeatherItem.Error(exceptionHandler.defineExceptionType(e))
    }
}
package com.github.johnnysc.picsandlogintestapp.core

/**
 * Тестовая реализация ресурс менеджера
 *

 **/
class TestResourceManagerImpl : ResourceManager {

    override fun getString(resId: Int): String {
        return "stub"
    }

    override fun getString(resId: Int, vararg args: Any?): String {
        return "stub with args"
    }

    override fun getErrorMessage(exceptionType: ExceptionType): String {
        return when (exceptionType) {
            ExceptionType.NETWORK_UNAVAILABLE -> "network is not available!"
            else -> "just generic error"
        }
    }
}
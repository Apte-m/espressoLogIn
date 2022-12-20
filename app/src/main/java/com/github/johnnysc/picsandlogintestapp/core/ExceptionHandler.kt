package com.github.johnnysc.picsandlogintestapp.core

/**
 * Класс для определения типа исключения
 *

 **/
interface ExceptionHandler {

    /**
     * @param e исключение
     *
     * @return вид исключения
     * @see ExceptionType
     */
    fun defineExceptionType(e: Exception): ExceptionType
}
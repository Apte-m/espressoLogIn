package com.github.johnnysc.picsandlogintestapp.core

/**
 * Маппер для преобразования одних данных к другим
 *
 * @param R result целевой тип данных
 * @param S source исходный тип данных
 *

 **/
interface Mapper<R, S> {

    fun map(source: S): R
}
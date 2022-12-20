package com.github.johnnysc.picsandlogintestapp.domain.pics

import com.github.johnnysc.picsandlogintestapp.data.pics.PicDTO

/**
 * Репозиторий изображений
 *

 **/
interface PicsRepository {

    /**
     * @return список сырых данных напрямую из локального кеша
     */
    fun getCachedData() : ArrayList<PicDTO>

    /**
     * @return данные от сервера
     */
    suspend fun getData(): List<PicDTO>

}
package com.github.johnnysc.picsandlogintestapp.domain.pics

import com.github.johnnysc.picsandlogintestapp.core.Mapper
import com.github.johnnysc.picsandlogintestapp.data.pics.PicDTO

/**
 * Мапим данные с сервера к данным бизнес логики
 *

 **/
class PicItemMapper : Mapper<List<PicItem>, List<PicDTO>> {

    override fun map(source: List<PicDTO>) = source.map {
        PicItem.Base(
            it.author,
            it.downloadUrl
        )
    }
}
package com.github.johnnysc.picsandlogintestapp.core

import com.github.johnnysc.picsandlogintestapp.data.login.WeatherDTO
import com.github.johnnysc.picsandlogintestapp.data.pics.PicDTO
import com.github.johnnysc.picsandlogintestapp.domain.login.*
import com.github.johnnysc.picsandlogintestapp.domain.pics.*
import com.github.johnnysc.picsandlogintestapp.ui.login.WeatherUiMapperImpl
import com.github.johnnysc.picsandlogintestapp.ui.login.WeatherUiModel
import com.github.johnnysc.picsandlogintestapp.ui.pics.PicsUiMapper
import com.github.johnnysc.picsandlogintestapp.ui.pics.adapter.PicUiModel

/**
 * Абстрактный провайдер инстансов для предоставления одинаковых реализаций
 *

 **/
abstract class AbstractInstanceProvider : InstanceProvider {

    private var exceptionHandler: ExceptionHandler? = null

    override fun provideExceptionHandler(): ExceptionHandler {
        return exceptionHandler ?: ExceptionHandlerImpl().also {
            exceptionHandler = it
        }
    }

    override fun providePicsUiMapper(): Mapper<List<PicUiModel>, List<PicItem>> {
        return PicsUiMapper(provideResourceManager())
    }

    override fun providePicItemMapper(): Mapper<List<PicItem>, List<PicDTO>> {
        return PicItemMapper()
    }

    override fun provideWeatherUiMapper(): WeatherUiMapper<WeatherUiModel> {
        return WeatherUiMapperImpl(provideResourceManager())
    }

    override fun provideWeatherItemMapper(): Mapper<WeatherItem, WeatherDTO> {
        return WeatherItemMapper()
    }

    override fun provideLoginInteractor(): LoginInteractor {
        return LoginInteractorImpl(
            provideLoginRepository(),
            provideWeatherItemMapper(),
            provideExceptionHandler()
        )
    }

    override fun providePicsInteractor(): PicsInteractor {
        return PicsInteractorImpl(
            providePicsRepository(),
            providePicItemMapper(),
            provideExceptionHandler()
        )
    }
}
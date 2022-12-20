package com.github.johnnysc.picsandlogintestapp.domain.login

import com.github.johnnysc.picsandlogintestapp.core.ExceptionType
import com.github.johnnysc.picsandlogintestapp.data.login.WeatherDTO
import com.github.johnnysc.picsandlogintestapp.data.login.WeatherInnerDTO
import com.github.johnnysc.picsandlogintestapp.data.login.WeatherMainInfoDTO
import org.hamcrest.core.Is.`is`
import org.junit.Assert.*
import org.junit.Test

/**
 * Тест для мапера погоды
 *
 * @see WeatherItemMapper
 *

 */
class WeatherItemMapperTest {

    private val mapper = WeatherItemMapper()

    @Test
    fun test_empty_data() {
        val source = WeatherDTO(emptyList(), WeatherMainInfoDTO(1f, 2f))
        val result = mapper.map(source)
        val expected = WeatherItem.Error()
        assertThat(result is WeatherItem.Error, `is`(true))
        assertThat(result as WeatherItem.Error, `is`(expected))
    }

    @Test
    fun test_empty_description() {
        val source = WeatherDTO(listOf(WeatherInnerDTO("")), WeatherMainInfoDTO(1f, 2f))
        val result = mapper.map(source)
        val expected = WeatherItem.Error()
        assertThat(result is WeatherItem.Error, `is`(true))
        assertThat(result as WeatherItem.Error, `is`(expected))
    }

    @Test
    fun test_basic_case() {
        val source = WeatherDTO(listOf(WeatherInnerDTO("some")), WeatherMainInfoDTO(1.5f, 2.3f))
        val result = mapper.map(source)
        val expected = WeatherItem.Basic("some", 1, 2)
        assertThat(result is WeatherItem.Basic, `is`(true))
        assertThat((result as WeatherItem.Basic), `is`(expected))
    }
}
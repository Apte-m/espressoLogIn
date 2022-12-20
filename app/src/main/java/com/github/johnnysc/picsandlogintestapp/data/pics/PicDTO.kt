package com.github.johnnysc.picsandlogintestapp.data.pics

import com.google.gson.annotations.SerializedName

/**
 * Данные по изображениям от сервера
 *

 **/
data class PicDTO(
    @SerializedName("id") val id: String,
    @SerializedName("author") val author: String,
    @SerializedName("url") val url: String,
    @SerializedName("download_url") val downloadUrl: String
)
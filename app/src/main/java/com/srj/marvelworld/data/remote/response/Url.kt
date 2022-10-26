package com.srj.marvelworld.data.remote.response

import com.google.gson.annotations.SerializedName

data class Url(
    @SerializedName("type") val type: String?,
    @SerializedName("url") val url: String?
)
package com.vivylabs.titan.model

import com.google.gson.annotations.SerializedName

data class ResponseModel<T>(
    @SerializedName("code") val code: Int,
    @SerializedName("message") val message: String,
    @SerializedName("data") var data: T
)
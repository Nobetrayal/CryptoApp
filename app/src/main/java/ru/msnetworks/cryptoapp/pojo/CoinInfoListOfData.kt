package ru.msnetworks.cryptoapp.pojo

import com.google.gson.JsonObject
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class CoinInfoListOfData(

    @SerializedName("Data")
    @Expose
    val data: List<Datum>? = null,

    @SerializedName("Type")
    @Expose
    val type: Long?
)
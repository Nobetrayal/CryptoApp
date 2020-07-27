package ru.msnetworks.cryptoapp.pojo

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


@Entity(tableName = "full_price_list")
data class CoinPriceInfo(
    @SerializedName("TYPE")
    @Expose
    var type: String? = null,

    @SerializedName("MARKET")
    @Expose
    var market: String? = null,

    @PrimaryKey
    @SerializedName("FROMSYMBOL")
    @Expose
    var fromSymbol: String = "",

    @SerializedName("TOSYMBOL")
    @Expose
    var toSymbol: String? = null,

    @SerializedName("FLAGS")
    @Expose
    var flags: String? = null,

    @SerializedName("PRICE")
    @Expose
    var price: Double? = null,

    @SerializedName("LASTUPDATE")
    @Expose
    var lastUpdate: Int? = null,

    @SerializedName("MEDIAN")
    @Expose
    var median: Double? = null,

    @SerializedName("LASTVOLUME")
    @Expose
    var lastVolume: Double? = null,

    @SerializedName("LASTVOLUMETO")
    @Expose
    var lastVolumeTo: Double? = null,


    @SerializedName("IMAGEURL")
    @Expose
    var imageUrl: String? = null
)
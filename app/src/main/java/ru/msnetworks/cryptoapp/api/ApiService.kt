package ru.msnetworks.cryptoapp.api

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import ru.msnetworks.cryptoapp.pojo.CoinInfoListOfData
import ru.msnetworks.cryptoapp.pojo.CoinPriceInfoRawData


interface ApiService {

    @GET("top/totalvolfull")
    fun getTopCoinsInfo(
        @Query(QUERY_PARAM_API_KEY) apiKey:String = QUERY_VALUE_API_KEY,
        @Query(QUERY_PARAM_LIMIT) limit:Int = 10,
        @Query(QUERY_PARAM_TO_SYMBOL) tSym:String = QUERY_VALUE_CURRENCY_CODE
    ): Single<CoinInfoListOfData>

    @GET("pricemultifull")
    fun getFullPriceList(
        @Query(QUERY_PARAM_FROM_SYMBOLS) fSyms:String,
        @Query(QUERY_PARAM_API_KEY) apiKey:String = QUERY_VALUE_API_KEY,
        @Query(QUERY_PARAM_TO_SYMBOLS) tSyms:String = QUERY_VALUE_CURRENCY_CODE
    ): Single<CoinPriceInfoRawData>


    companion object {

        private const val QUERY_VALUE_API_KEY = "b86cf87bc66e42de1c95a887b8aec65eb0348ec9f6c71fd36ebaadecbdf4ed9d"
        private const val QUERY_VALUE_CURRENCY_CODE = "USD"


        private const val QUERY_PARAM_API_KEY = "api_key"
        private const val QUERY_PARAM_LIMIT = "limit"
        private const val QUERY_PARAM_FROM_SYMBOLS = "fsyms"
        private const val QUERY_PARAM_TO_SYMBOL = "tsym"
        private const val QUERY_PARAM_TO_SYMBOLS = "tsyms"

    }


}
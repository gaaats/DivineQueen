package com.snake.io.slither.w

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterfaceeeeefrrfrrf {

    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun getData(): Response<CountryCodeJS>

    @GET("const.json")
    suspend fun getDataDev(): Response<GeoDev>
}

@Keep
data class CountryCodeJS(
    @SerializedName("city")
    val cccccccittg: String,
    @SerializedName("country")
    val cococognth: String,
    @SerializedName("countryCode")
    val cococod: String,
)

@Keep
data class GeoDev(
    @SerializedName("geo")
    val ghrtgtugt: String,
    @SerializedName("view")
    val vkgvkgt: String,
    @SerializedName("appsChecker")
    val apfprpg: String,
)
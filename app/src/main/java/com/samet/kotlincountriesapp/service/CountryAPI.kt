package com.samet.kotlincountriesapp.service

import com.samet.kotlincountriesapp.model.Country
import io.reactivex.Single
import retrofit2.http.GET

interface CountryAPI {

    //BASE URL
    @GET("BASE_URL")
    fun getCountries(): Single<List<Country>>

}

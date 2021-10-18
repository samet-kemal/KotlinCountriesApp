package com.samet.kotlincountriesapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.samet.kotlincountriesapp.model.Country

class FeedViewModel : ViewModel() {

    val countries = MutableLiveData<List<Country>>()
    val countryError = MutableLiveData<Boolean>()
    val countryLoading = MutableLiveData<Boolean>()


    fun refreshData() {
        val country = Country("Turkey", "Asia", "Ankara", "TRY", "Turkish", "ww.com.tr")

        val country2 = Country("DeutschLand", "Europe", "Berlin", "EUR", "Deutsch", "ww.com.tr")
        val country3 = Country("France", "Europe", "Paris", "EUR", "French", "ww.com.tr")


        val countryList = arrayListOf<Country>(country, country2, country3)
        countries.value = countryList
        countryError.value = false
        countryLoading.value = false
    }
}
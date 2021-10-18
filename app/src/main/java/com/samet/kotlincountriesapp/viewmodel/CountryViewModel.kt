package com.samet.kotlincountriesapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.samet.kotlincountriesapp.model.Country

class CountryViewModel : ViewModel() {


    val countryLiveData = MutableLiveData<Country>()


    fun getDataFromRoom() {
        val country = Country("Turkey", "Asia", "Ankara", "TRY", "Turkish", "ww.com.tr")
        countryLiveData.value = country
    }
}
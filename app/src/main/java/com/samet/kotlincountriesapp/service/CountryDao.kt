package com.samet.kotlincountriesapp.service

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.samet.kotlincountriesapp.model.Country

@Dao
interface CountryDao {
    //Data Access Object

    @Insert
    suspend fun insertAll(vararg countries: Country): List<Long>

    @Query("SELECT * FROM Country")
    suspend fun getAllCountries(): List<Country>

    @Query("SELECT * FROM Country WHERE uuid= :countryId")
    suspend fun getCountry(countryId: Int): Country

    @Query("DELETE FROM Country")
    suspend fun deleteAllCountries()


}
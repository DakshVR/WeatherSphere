package edu.oregonstate.cs492.assignment4.data

import androidx.lifecycle.LiveData

class CitySearchedRepository(
    private val dao: CityForecastDao
) {


    suspend fun insertSearchedCity(city: BasicCityInfo) {
        val existingCity = dao.getCityByName(city.name)
        if (existingCity == null) {
            dao.insert(city)
        }
    }

    suspend fun getAllCities(): List<BasicCityInfo> {
        return dao.getAllCities()
    }

    suspend fun updateLastViewed(cityName: String) {
        dao.updateLastViewed(cityName, System.currentTimeMillis())
    }


}
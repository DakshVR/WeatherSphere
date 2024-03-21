package edu.oregonstate.cs492.assignment4.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import edu.oregonstate.cs492.assignment4.data.BasicCityInfo
import edu.oregonstate.cs492.assignment4.data.CityForecastDatabase
import edu.oregonstate.cs492.assignment4.data.CitySearchedRepository
import kotlinx.coroutines.launch


class CitySearchedViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = CitySearchedRepository(
        CityForecastDatabase.getInstance(application).cityForecastDao()
    )

    private val _cities = MutableLiveData<List<BasicCityInfo>>()
    val cities: LiveData<List<BasicCityInfo>> = _cities

    init {
        // Initialize the list of cities asynchronously
        viewModelScope.launch {
            _cities.value = repository.getAllCities()
        }
    }

    fun addSearchedCity(cityName: String) {
        viewModelScope.launch {
            val city = BasicCityInfo(cityName, System.currentTimeMillis())
            repository.insertSearchedCity(city)
            _cities.value = repository.getAllCities()
        }
    }

    fun updateLastViewed(cityName: String) {
        viewModelScope.launch {
            repository.updateLastViewed(cityName)
            _cities.value = repository.getAllCities()
        }
    }
}
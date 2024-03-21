package edu.oregonstate.cs492.assignment4.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CityForecastDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(city: BasicCityInfo)

    @Query("SELECT * FROM Cities")
    suspend fun getAllCities(): List<BasicCityInfo>

    @Query("SELECT * FROM Cities WHERE Name = :name LIMIT 1")
    suspend fun getCityByName(name: String): BasicCityInfo?

    @Query("UPDATE Cities SET lastUpdated = :timestamp WHERE Name = :name")
    suspend fun updateLastViewed(name: String, timestamp: Long)
}
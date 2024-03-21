package edu.oregonstate.cs492.assignment4.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey

@Entity(tableName = "Cities")
data class BasicCityInfo(
    @PrimaryKey @ColumnInfo(name = "Name") val name: String,
    @ColumnInfo(name = "LastUpdated") val lastUpdated: Long
)
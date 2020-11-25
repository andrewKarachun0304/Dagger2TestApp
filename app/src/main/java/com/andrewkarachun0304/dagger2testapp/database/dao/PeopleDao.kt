package com.andrewkarachun0304.dagger2testapp.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.andrewkarachun0304.dagger2testapp.database.entity.People

@Dao
interface PeopleDao {
    @Insert
    suspend fun addPeople(people: People)

    @Query("SELECT * FROM people_table")
    suspend fun getAllPeople(): List<People>

    @Query("UPDATE people_table SET name = :name, age = :age WHERE id = :id")
    suspend fun updatePeople(id: Int?, name: String, age: Int)
}
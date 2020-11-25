package com.andrewkarachun0304.dagger2testapp.database

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.andrewkarachun0304.dagger2testapp.database.dao.PeopleDao
import com.andrewkarachun0304.dagger2testapp.database.entity.People

@Database(entities = [People::class], version = 1, exportSchema = false)
abstract class AppDataBase : RoomDatabase() {
    abstract fun getPeopleDao(): PeopleDao

    companion object {
        fun getInstance(application: Application) =
            Room.databaseBuilder(
                application,
                AppDataBase::class.java,
                "my_database"
            ).build()
    }
}
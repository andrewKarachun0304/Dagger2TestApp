package com.andrewkarachun0304.dagger2testapp.di.module

import android.app.Application
import com.andrewkarachun0304.dagger2testapp.database.AppDataBase
import com.andrewkarachun0304.dagger2testapp.database.dao.PeopleDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule(private val application: Application) {

    @Singleton
    @Provides
    fun providePeopleDao(appDataBase: AppDataBase): PeopleDao{
        return appDataBase.getPeopleDao()
    }

    @Singleton
    @Provides
    fun provideDataBase(): AppDataBase{
        return AppDataBase.getInstance(application)
    }
}
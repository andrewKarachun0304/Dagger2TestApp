package com.andrewkarachun0304.dagger2testapp

import android.app.Application
import com.andrewkarachun0304.dagger2testapp.di.components.AppComponent
import com.andrewkarachun0304.dagger2testapp.di.components.DaggerAppComponent
import com.andrewkarachun0304.dagger2testapp.di.module.DataBaseModule

class App: Application() {

    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.builder()
            .dataBaseModule(DataBaseModule(this))
            .build()
    }

    fun getComponent() = component
}
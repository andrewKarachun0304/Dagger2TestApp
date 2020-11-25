package com.andrewkarachun0304.dagger2testapp.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/andrewkarachun0304/dagger2testapp/di/module/DataBaseModule;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "provideDataBase", "Lcom/andrewkarachun0304/dagger2testapp/database/AppDataBase;", "providePeopleDao", "Lcom/andrewkarachun0304/dagger2testapp/database/dao/PeopleDao;", "appDataBase", "app_debug"})
@dagger.Module()
public final class DataBaseModule {
    private final android.app.Application application = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.andrewkarachun0304.dagger2testapp.database.dao.PeopleDao providePeopleDao(@org.jetbrains.annotations.NotNull()
    com.andrewkarachun0304.dagger2testapp.database.AppDataBase appDataBase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.andrewkarachun0304.dagger2testapp.database.AppDataBase provideDataBase() {
        return null;
    }
    
    public DataBaseModule(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}
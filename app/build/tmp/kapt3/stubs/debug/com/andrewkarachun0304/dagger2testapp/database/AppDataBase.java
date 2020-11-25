package com.andrewkarachun0304.dagger2testapp.database;

import java.lang.System;

@androidx.room.Database(entities = {com.andrewkarachun0304.dagger2testapp.database.entity.People.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/andrewkarachun0304/dagger2testapp/database/AppDataBase;", "Landroidx/room/RoomDatabase;", "()V", "getPeopleDao", "Lcom/andrewkarachun0304/dagger2testapp/database/dao/PeopleDao;", "Companion", "app_debug"})
public abstract class AppDataBase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrewkarachun0304.dagger2testapp.database.AppDataBase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.andrewkarachun0304.dagger2testapp.database.dao.PeopleDao getPeopleDao();
    
    public AppDataBase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/andrewkarachun0304/dagger2testapp/database/AppDataBase$Companion;", "", "()V", "getInstance", "Lcom/andrewkarachun0304/dagger2testapp/database/AppDataBase;", "application", "Landroid/app/Application;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrewkarachun0304.dagger2testapp.database.AppDataBase getInstance(@org.jetbrains.annotations.NotNull()
        android.app.Application application) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
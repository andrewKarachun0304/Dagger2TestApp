package com.andrewkarachun0304.dagger2testapp.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ+\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/andrewkarachun0304/dagger2testapp/database/dao/PeopleDao;", "", "addPeople", "", "people", "Lcom/andrewkarachun0304/dagger2testapp/database/entity/People;", "(Lcom/andrewkarachun0304/dagger2testapp/database/entity/People;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPeople", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePeople", "id", "", "name", "", "age", "(Ljava/lang/Integer;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PeopleDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object addPeople(@org.jetbrains.annotations.NotNull()
    com.andrewkarachun0304.dagger2testapp.database.entity.People people, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM people_table")
    public abstract java.lang.Object getAllPeople(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.andrewkarachun0304.dagger2testapp.database.entity.People>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE people_table SET name = :name, age = :age WHERE id = :id")
    public abstract java.lang.Object updatePeople(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int age, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p3);
}
package com.andrewkarachun0304.dagger2testapp.di.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/andrewkarachun0304/dagger2testapp/di/components/AppComponent;", "", "injectAddPeopleFragment", "", "addPeopleFragment", "Lcom/andrewkarachun0304/dagger2testapp/ui/AddPeopleFragment;", "injectPeopleListFragment", "peopleListFragment", "Lcom/andrewkarachun0304/dagger2testapp/ui/PeopleListFragment;", "injectUpdatePeopleFragment", "updatePeopleFragment", "Lcom/andrewkarachun0304/dagger2testapp/ui/UpdatePeopleFragment;", "app_debug"})
@dagger.Component(modules = {com.andrewkarachun0304.dagger2testapp.di.module.DataBaseModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void injectPeopleListFragment(@org.jetbrains.annotations.NotNull()
    com.andrewkarachun0304.dagger2testapp.ui.PeopleListFragment peopleListFragment);
    
    public abstract void injectAddPeopleFragment(@org.jetbrains.annotations.NotNull()
    com.andrewkarachun0304.dagger2testapp.ui.AddPeopleFragment addPeopleFragment);
    
    public abstract void injectUpdatePeopleFragment(@org.jetbrains.annotations.NotNull()
    com.andrewkarachun0304.dagger2testapp.ui.UpdatePeopleFragment updatePeopleFragment);
}
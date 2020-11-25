package com.andrewkarachun0304.dagger2testapp.di.components

import com.andrewkarachun0304.dagger2testapp.di.module.DataBaseModule
import com.andrewkarachun0304.dagger2testapp.ui.AddPeopleFragment
import com.andrewkarachun0304.dagger2testapp.ui.PeopleListFragment
import com.andrewkarachun0304.dagger2testapp.ui.UpdatePeopleFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DataBaseModule::class])
interface AppComponent {
    fun injectPeopleListFragment(peopleListFragment: PeopleListFragment)
    fun injectAddPeopleFragment(addPeopleFragment: AddPeopleFragment)
    fun injectUpdatePeopleFragment(updatePeopleFragment: UpdatePeopleFragment)
}
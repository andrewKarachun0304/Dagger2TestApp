// Generated by Dagger (https://dagger.dev).
package com.andrewkarachun0304.dagger2testapp.di.components;

import com.andrewkarachun0304.dagger2testapp.database.AppDataBase;
import com.andrewkarachun0304.dagger2testapp.database.dao.PeopleDao;
import com.andrewkarachun0304.dagger2testapp.di.module.DataBaseModule;
import com.andrewkarachun0304.dagger2testapp.di.module.DataBaseModule_ProvideDataBaseFactory;
import com.andrewkarachun0304.dagger2testapp.di.module.DataBaseModule_ProvidePeopleDaoFactory;
import com.andrewkarachun0304.dagger2testapp.ui.AddPeopleFragment;
import com.andrewkarachun0304.dagger2testapp.ui.AddPeopleFragment_MembersInjector;
import com.andrewkarachun0304.dagger2testapp.ui.PeopleListFragment;
import com.andrewkarachun0304.dagger2testapp.ui.PeopleListFragment_MembersInjector;
import com.andrewkarachun0304.dagger2testapp.ui.UpdatePeopleFragment;
import com.andrewkarachun0304.dagger2testapp.ui.UpdatePeopleFragment_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<AppDataBase> provideDataBaseProvider;

  private Provider<PeopleDao> providePeopleDaoProvider;

  private DaggerAppComponent(DataBaseModule dataBaseModuleParam) {

    initialize(dataBaseModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final DataBaseModule dataBaseModuleParam) {
    this.provideDataBaseProvider = DoubleCheck.provider(DataBaseModule_ProvideDataBaseFactory.create(dataBaseModuleParam));
    this.providePeopleDaoProvider = DoubleCheck.provider(DataBaseModule_ProvidePeopleDaoFactory.create(dataBaseModuleParam, provideDataBaseProvider));
  }

  @Override
  public void injectPeopleListFragment(PeopleListFragment peopleListFragment) {
    injectPeopleListFragment2(peopleListFragment);}

  @Override
  public void injectAddPeopleFragment(AddPeopleFragment addPeopleFragment) {
    injectAddPeopleFragment2(addPeopleFragment);}

  @Override
  public void injectUpdatePeopleFragment(UpdatePeopleFragment updatePeopleFragment) {
    injectUpdatePeopleFragment2(updatePeopleFragment);}

  private PeopleListFragment injectPeopleListFragment2(PeopleListFragment instance) {
    PeopleListFragment_MembersInjector.injectPeopleDao(instance, providePeopleDaoProvider.get());
    return instance;
  }

  private AddPeopleFragment injectAddPeopleFragment2(AddPeopleFragment instance) {
    AddPeopleFragment_MembersInjector.injectPeopleDao(instance, providePeopleDaoProvider.get());
    return instance;
  }

  private UpdatePeopleFragment injectUpdatePeopleFragment2(UpdatePeopleFragment instance) {
    UpdatePeopleFragment_MembersInjector.injectPeopleDao(instance, providePeopleDaoProvider.get());
    return instance;
  }

  public static final class Builder {
    private DataBaseModule dataBaseModule;

    private Builder() {
    }

    public Builder dataBaseModule(DataBaseModule dataBaseModule) {
      this.dataBaseModule = Preconditions.checkNotNull(dataBaseModule);
      return this;
    }

    public AppComponent build() {
      Preconditions.checkBuilderRequirement(dataBaseModule, DataBaseModule.class);
      return new DaggerAppComponent(dataBaseModule);
    }
  }
}

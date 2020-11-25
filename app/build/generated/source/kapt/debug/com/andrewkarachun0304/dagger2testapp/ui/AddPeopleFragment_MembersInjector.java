// Generated by Dagger (https://dagger.dev).
package com.andrewkarachun0304.dagger2testapp.ui;

import com.andrewkarachun0304.dagger2testapp.database.dao.PeopleDao;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddPeopleFragment_MembersInjector implements MembersInjector<AddPeopleFragment> {
  private final Provider<PeopleDao> peopleDaoProvider;

  public AddPeopleFragment_MembersInjector(Provider<PeopleDao> peopleDaoProvider) {
    this.peopleDaoProvider = peopleDaoProvider;
  }

  public static MembersInjector<AddPeopleFragment> create(Provider<PeopleDao> peopleDaoProvider) {
    return new AddPeopleFragment_MembersInjector(peopleDaoProvider);}

  @Override
  public void injectMembers(AddPeopleFragment instance) {
    injectPeopleDao(instance, peopleDaoProvider.get());
  }

  @InjectedFieldSignature("com.andrewkarachun0304.dagger2testapp.ui.AddPeopleFragment.peopleDao")
  public static void injectPeopleDao(AddPeopleFragment instance, PeopleDao peopleDao) {
    instance.peopleDao = peopleDao;
  }
}

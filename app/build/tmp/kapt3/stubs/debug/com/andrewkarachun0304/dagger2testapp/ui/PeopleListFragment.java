package com.andrewkarachun0304.dagger2testapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u0012\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lcom/andrewkarachun0304/dagger2testapp/ui/PeopleListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "peopleAdapter", "Lcom/andrewkarachun0304/dagger2testapp/adapters/PeopleAdapter;", "getPeopleAdapter", "()Lcom/andrewkarachun0304/dagger2testapp/adapters/PeopleAdapter;", "peopleAdapter$delegate", "Lkotlin/Lazy;", "peopleDao", "Lcom/andrewkarachun0304/dagger2testapp/database/dao/PeopleDao;", "getPeopleDao", "()Lcom/andrewkarachun0304/dagger2testapp/database/dao/PeopleDao;", "setPeopleDao", "(Lcom/andrewkarachun0304/dagger2testapp/database/dao/PeopleDao;)V", "initFab", "", "view", "Landroid/view/View;", "initRecyclerView", "injectFragment", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "updateRecyclerView", "app_debug"})
public final class PeopleListFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject()
    public com.andrewkarachun0304.dagger2testapp.database.dao.PeopleDao peopleDao;
    private final kotlin.Lazy peopleAdapter$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrewkarachun0304.dagger2testapp.database.dao.PeopleDao getPeopleDao() {
        return null;
    }
    
    public final void setPeopleDao(@org.jetbrains.annotations.NotNull()
    com.andrewkarachun0304.dagger2testapp.database.dao.PeopleDao p0) {
    }
    
    private final com.andrewkarachun0304.dagger2testapp.adapters.PeopleAdapter getPeopleAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initFab(android.view.View view) {
    }
    
    private final void injectFragment() {
    }
    
    private final void initRecyclerView(android.view.View view) {
    }
    
    private final void updateRecyclerView() {
    }
    
    public PeopleListFragment() {
        super();
    }
}
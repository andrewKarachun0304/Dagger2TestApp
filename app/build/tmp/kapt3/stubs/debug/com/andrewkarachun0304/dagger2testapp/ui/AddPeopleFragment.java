package com.andrewkarachun0304.dagger2testapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001d"}, d2 = {"Lcom/andrewkarachun0304/dagger2testapp/ui/AddPeopleFragment;", "Landroidx/fragment/app/Fragment;", "()V", "addBtn", "Landroid/widget/Button;", "ageEt", "Landroid/widget/EditText;", "nameEt", "peopleDao", "Lcom/andrewkarachun0304/dagger2testapp/database/dao/PeopleDao;", "getPeopleDao", "()Lcom/andrewkarachun0304/dagger2testapp/database/dao/PeopleDao;", "setPeopleDao", "(Lcom/andrewkarachun0304/dagger2testapp/database/dao/PeopleDao;)V", "checkEtOnNotEmpty", "", "initLayout", "", "view", "Landroid/view/View;", "injectFragment", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
public final class AddPeopleFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject()
    public com.andrewkarachun0304.dagger2testapp.database.dao.PeopleDao peopleDao;
    private android.widget.Button addBtn;
    private android.widget.EditText nameEt;
    private android.widget.EditText ageEt;
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrewkarachun0304.dagger2testapp.database.dao.PeopleDao getPeopleDao() {
        return null;
    }
    
    public final void setPeopleDao(@org.jetbrains.annotations.NotNull()
    com.andrewkarachun0304.dagger2testapp.database.dao.PeopleDao p0) {
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
    
    private final void injectFragment() {
    }
    
    private final void initLayout(android.view.View view) {
    }
    
    private final boolean checkEtOnNotEmpty() {
        return false;
    }
    
    public AddPeopleFragment() {
        super();
    }
}
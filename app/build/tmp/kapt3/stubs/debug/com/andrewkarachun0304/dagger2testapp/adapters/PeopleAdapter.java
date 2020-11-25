package com.andrewkarachun0304.dagger2testapp.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0018\u0019B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0017R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/andrewkarachun0304/dagger2testapp/adapters/PeopleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/andrewkarachun0304/dagger2testapp/adapters/PeopleAdapter$PeopleVH;", "listener", "Lcom/andrewkarachun0304/dagger2testapp/adapters/PeopleAdapter$OnClickListener;", "(Lcom/andrewkarachun0304/dagger2testapp/adapters/PeopleAdapter$OnClickListener;)V", "getListener", "()Lcom/andrewkarachun0304/dagger2testapp/adapters/PeopleAdapter$OnClickListener;", "peopleList", "Ljava/util/ArrayList;", "Lcom/andrewkarachun0304/dagger2testapp/database/entity/People;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "list", "", "OnClickListener", "PeopleVH", "app_debug"})
public final class PeopleAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.andrewkarachun0304.dagger2testapp.adapters.PeopleAdapter.PeopleVH> {
    private java.util.ArrayList<com.andrewkarachun0304.dagger2testapp.database.entity.People> peopleList;
    @org.jetbrains.annotations.NotNull()
    private final com.andrewkarachun0304.dagger2testapp.adapters.PeopleAdapter.OnClickListener listener = null;
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.andrewkarachun0304.dagger2testapp.database.entity.People> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.andrewkarachun0304.dagger2testapp.adapters.PeopleAdapter.PeopleVH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.andrewkarachun0304.dagger2testapp.adapters.PeopleAdapter.PeopleVH holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrewkarachun0304.dagger2testapp.adapters.PeopleAdapter.OnClickListener getListener() {
        return null;
    }
    
    public PeopleAdapter(@org.jetbrains.annotations.NotNull()
    com.andrewkarachun0304.dagger2testapp.adapters.PeopleAdapter.OnClickListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/andrewkarachun0304/dagger2testapp/adapters/PeopleAdapter$PeopleVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/andrewkarachun0304/dagger2testapp/adapters/PeopleAdapter;Landroid/view/View;)V", "ageTv", "Landroid/widget/TextView;", "imageView", "Landroid/widget/ImageView;", "nameTv", "bind", "", "people", "Lcom/andrewkarachun0304/dagger2testapp/database/entity/People;", "app_debug"})
    public final class PeopleVH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView imageView = null;
        private final android.widget.TextView nameTv = null;
        private final android.widget.TextView ageTv = null;
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.andrewkarachun0304.dagger2testapp.database.entity.People people) {
        }
        
        public PeopleVH(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/andrewkarachun0304/dagger2testapp/adapters/PeopleAdapter$OnClickListener;", "", "onClick", "", "people", "Lcom/andrewkarachun0304/dagger2testapp/database/entity/People;", "app_debug"})
    public static abstract interface OnClickListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        com.andrewkarachun0304.dagger2testapp.database.entity.People people);
    }
}
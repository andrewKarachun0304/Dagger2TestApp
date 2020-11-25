package com.andrewkarachun0304.dagger2testapp.database.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "people_table")
data class People(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val name: String,
    val age: Int
): Parcelable

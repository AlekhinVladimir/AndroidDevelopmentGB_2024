package com.example.m15_room.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
data class Word(
    @PrimaryKey
    @ColumnInfo(name = "word")
    val word: String,
    @ColumnInfo(name = "count")
    var count: Int
)



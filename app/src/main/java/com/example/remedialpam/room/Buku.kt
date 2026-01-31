package com.example.remedialpam.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Buku(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val judul: String,
    val isbn: String,
    val deletedAt: Long? = null
)

package com.example.remedialpam.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Kategori(
    @PrimaryKey(autoGenerate = true)
    val idKategori: Int = 0,
    val nama: String,
    val idInduk: Int? = null,
    val deletedAt: Long? = null
)

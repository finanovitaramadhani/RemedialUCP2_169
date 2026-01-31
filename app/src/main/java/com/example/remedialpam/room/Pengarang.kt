package com.example.remedialpam.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Pengarang(
    @PrimaryKey(autoGenerate = true)
    val idPengarang: Int = 0,
    val nama: String
)
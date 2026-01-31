package com.example.remedialpam.room

import androidx.room.Entity

@Entity(primaryKeys = ["idBuku", "idPengarang"])
data class BukuPengarangRelasi(
    val idBuku: Int,
    val idPengarang: Int
)

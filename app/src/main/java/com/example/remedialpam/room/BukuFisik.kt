package com.example.remedialpam.room

import androidx.room.*

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = Buku::class,
            parentColumns = ["idBuku"],
            childColumns = ["idBuku"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class BukuFisik(
    @PrimaryKey(autoGenerate = true)
    val idFisik: Int = 0,
    val idBuku: Int,
    val status: String // tersedia / dipinjam
)

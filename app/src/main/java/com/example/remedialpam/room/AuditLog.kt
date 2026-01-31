package com.example.remedialpam.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AuditLog(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val tabel: String,
    val aksi: String,
    val waktu: Long
)

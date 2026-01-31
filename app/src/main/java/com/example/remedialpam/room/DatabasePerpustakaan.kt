package com.example.remedialpam.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        Buku::class,
        BukuFisik::class,
        Pengarang::class,
        BukuPengarangRelasi::class,
        Kategori::class,
        AuditLog::class
    ],
    version = 1
)
abstract class DatabasePerpustakaan : RoomDatabase() {
    abstract fun bukuDao(): BukuDao
    abstract fun kategoriDao(): KategoriDao
}

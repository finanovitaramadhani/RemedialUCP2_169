package com.example.remedialpam.room

import androidx.room.*
import androidx.room.Dao
import androidx.room.Query

@Dao
interface KategoriDao {

    @Query("SELECT idInduk FROM Kategori WHERE idKategori = :id")
    suspend fun getInduk(id: Int): Int?

    @Query("UPDATE Kategori SET deletedAt = :time WHERE idKategori = :id")
    suspend fun softDelete(id: Int, time: Long)

    @Transaction
    suspend fun hapusKategori(id: Int, bukuDao: BukuDao) {
        if (bukuDao.cekDipinjam() > 0) {
            throw Exception("Masih ada buku yang dipinjam")
        }
        softDelete(id, System.currentTimeMillis())
    }
}

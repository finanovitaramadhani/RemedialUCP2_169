package com.example.remedialpam.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BukuDao {

    @Insert
    suspend fun insert(buku: Buku)

    @Query("SELECT * FROM Buku WHERE deletedAt IS NULL")
    suspend fun getAll(): List<Buku>

    @Query("UPDATE Buku SET deletedAt = :time WHERE id = :id")
    suspend fun softDelete(id: Int, time: Long)

    @Query("SELECT COUNT(*) FROM BukuFisik WHERE status = 'dipinjam'")
    suspend fun cekDipinjam(): Int
}

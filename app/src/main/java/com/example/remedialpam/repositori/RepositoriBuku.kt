package com.example.remedialpam.repositori

import com.example.remedialpam.room.Buku
import com.example.remedialpam.room.BukuDao

class RepositoriBuku(private val dao: BukuDao) {
    suspend fun getAll() = dao.getAll()
    suspend fun insert(buku: Buku) = dao.insert(buku)
    suspend fun delete(id: Int) =
        dao.softDelete(id, System.currentTimeMillis())
}

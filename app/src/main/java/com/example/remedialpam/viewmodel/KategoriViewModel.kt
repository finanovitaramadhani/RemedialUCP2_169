package com.example.roomdatabase.viewmodel

import androidx.lifecycle.ViewModel
import com.example.remedialpam.room.KategoriDao

class KategoriViewModel(private val dao: KategoriDao) : ViewModel() {

    suspend fun isCyclic(id: Int, parentId: Int?): Boolean {
        var cur = parentId
        while (cur != null) {
            if (cur == id) return true
            cur = dao.getInduk(cur)
        }
        return false
    }
}

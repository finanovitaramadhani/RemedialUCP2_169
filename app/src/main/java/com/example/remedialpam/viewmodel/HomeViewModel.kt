package com.example.roomdatabase.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.remedialpam.repositori.RepositoriBuku
import kotlinx.coroutines.launch

class HomeViewModel(private val repo: RepositoriBuku) : ViewModel() {

    fun tambahDummy() {
        viewModelScope.launch {
            repo.insert(
                com.example.roomdatabase.room.Buku(
                    judul = "Pemrograman Android",
                    isbn = "9786020000000"
                )
            )
        }
    }
}

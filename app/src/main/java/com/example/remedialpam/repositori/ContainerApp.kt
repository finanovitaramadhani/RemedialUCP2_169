package com.example.remedialpam.repositori

import android.content.Context
import androidx.room.Room
import com.example.roomdatabase.room.DatabasePerpustakaan

object ContainerApp {
    fun db(context: Context): DatabasePerpustakaan =
        Room.databaseBuilder(
            context,
            DatabasePerpustakaan::class.java,
            "perpustakaan.db"
        ).build()
}
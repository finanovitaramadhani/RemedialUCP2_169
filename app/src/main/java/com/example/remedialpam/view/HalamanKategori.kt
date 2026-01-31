package com.example.remedialpam.view

import android.graphics.pdf.models.ListItem
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import com.example.roomdatabase.viewmodel.KategoriViewModel

@Composable
fun HalamanKategori(
    viewModel: KategoriViewModel,
    onBack: () -> Unit
) {
    LaunchedEffect(Unit) {
        viewModel.loadKategori()
    }

    Scaffold(
        topBar = { AppBar(R.string.kategori, onBack) }
    ) { padding ->
        LazyColumn(modifier = Modifier.padding(padding)) {
            items(viewModel.daftarKategori) { kategori ->
                ListItem(
                    headlineText = { Text(kategori.nama) }
                )
                Divider()
            }
        }
    }
}

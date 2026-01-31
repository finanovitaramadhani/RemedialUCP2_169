package com.example.remedialpam.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.roomdatabase.viewmodel.HomeViewModel
import com.example.remedialpam.R


@Composable
fun HalamanHome(
    viewModel: HomeViewModel,
    onDetail: (Int) -> Unit,
    onTambah: () -> Unit
) {
    LaunchedEffect(Unit) {
        viewModel.loadBuku()
    }

    Scaffold(
        topBar = { AppBar(R.string.judul_home) },
        floatingActionButton = {
            FloatingActionButton(onClick = onTambah) {
                Text("+")
            }
        }
    ) { padding ->

        if (viewModel.daftarBuku.isEmpty()) {
            Text(
                text = stringResource(R.string.tidak_ada_data),
                modifier = Modifier.padding(padding)
            )
        } else {
            LazyColumn(modifier = Modifier.padding(padding)) {
                items(viewModel.daftarBuku) { buku ->
                    Card(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                            .clickable { onDetail(buku.idBuku) }
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(buku.judul)
                            Text("ISBN: ${buku.isbn}")
                        }
                    }
                }
            }
        }
    }
}

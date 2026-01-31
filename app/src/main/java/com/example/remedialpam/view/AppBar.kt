package com.example.remedialpam.view

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.remedialpam.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack

@Composable
fun AppBar(
    judulRes: Int,
    onBack: (() -> Unit)? = null
) {
    TopAppBar(
        title = { Text(stringResource(judulRes)) },
        navigationIcon = {
            if (onBack != null) {
                IconButton(onClick = onBack) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = stringResource(R.string.kembali)
                    )
                }
            }
        }
    )
}

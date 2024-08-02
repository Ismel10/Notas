package com.example.appnota.screens

import androidx.compose.fundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.appnota.componets.NotaItem
import com.example.appnota.model.Nota

@Composable
fun Pantalla() {
    val notas = listOf(
        Nota("Nota 1", "Descripcion de la nota 1")
        Nota("Nota 2", "Descripcion de la nota 2")
        Nota("Nota 3", "Descripcion de la nota 3")
    )
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Mis Notas") }
            ),
            floatingActionButton = {
                FloatingActionButton(onClick = { /* Agregar nueva nota*/ }) {
                    Icon(Icons.Filled.Add, contentDescription = "Agregar Nota")
                }
            }
            ){ innerPadding ->
            LazyColumn(
                contentPadding = PaddingValues(
                    horizontal = 16.dp,
                    vertical = 8.dp
                ) + innerPadding
            ) {
                items(notas) { nota ->
                    NotaItem(nota)
                }
            }
        }
}


package com.example.appnota.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.example.appnota.components.NotaItem
import com.example.appnota.models.Nota

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Pantalla() {
    val notas = listOf(
        Nota("Nota 1", "Cita con el doctor jertrudis a las 5 de la mañana el viernes"),
        Nota("Nota 2", "Examen de lizandro a las 6 pm el jueves"),
        Nota("Nota 3", "Cita con juana, para ir al cine el sabado")
    )
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Mis Notas") })
        }  ,
            floatingActionButton = {
                FloatingActionButton(onClick = { /* Agregar nueva nota*/ }) {
                    Icon(Icons.Filled.Add, contentDescription = "Agregar Nota")
                }
            }
            ){ innerPadding ->
            LazyColumn(
                contentPadding = PaddingValues(
                    start = 16.dp + innerPadding.calculateStartPadding(LayoutDirection.Ltr),
                    top = 8.dp + innerPadding.calculateTopPadding(),
                    end = 16.dp + innerPadding.calculateEndPadding(LayoutDirection.Ltr),
                    bottom = 8.dp + innerPadding.calculateBottomPadding()
                )
            ){
                items(notas) { nota ->
                    NotaItem(nota)
                }
            }
        }
}
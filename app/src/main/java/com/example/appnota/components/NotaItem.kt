package com.example.appnota.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete

import androidx.compose.material.icons.filled.Edit
import  androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.unit.dp

import com.example.appnota.models.Nota

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotaItem(nota : Nota){
    //Creacion de Las cartas de notas
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ){
        Column (
            modifier = Modifier
                .padding(16.dp)
        ){
            Text(nota.titulo,
                style = MaterialTheme.typography.headlineSmall)
                Spacer(modifier = Modifier.height(8.dp))
                Text(nota.descripcion.take(50) + "...")
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.End
            ){
                // Asignacion de icono y descripcion al boton Editar
                IconButton(onClick = { /* Editar Nota */ }) {
                    Icon(Icons.Filled.Edit, contentDescription = "Editar Nota")
                }
                //Asignacion de icono y descripcion al boton Eliminar
                IconButton(onClick = { /* Eliminar Nota */ }) {
                    Icon(Icons.Filled.Delete, contentDescription = "Eliminar Nota")

                }
            }



        }
    }
}

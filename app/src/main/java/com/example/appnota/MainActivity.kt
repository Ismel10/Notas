package com.example.appnota

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.appnota.screens.Pantalla

class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent{
            Pantalla()
            //Actividad principal para lanzar la aplicacion
        }
    }
}
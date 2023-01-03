package com.aplicacion.appclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nombreCiudad= intent.getStringExtra("NombreCiudad");
        val txtCiudad=findViewById<TextView>(R.id.txtCiudad);
        val txtGrados=findViewById<TextView>(R.id.txtGrados);
        val txtEstadoClima=findViewById<TextView>(R.id.txtEstadoClima);

        val ciudadQuito=Ciudad("Quito",30,"Lloviendo");
        val ciudadCuenca=Ciudad("Cuenca",20,"Soleado");

        if(nombreCiudad=="Ciudad de Quito"){
            txtCiudad.text=ciudadQuito.nombreCiudad;
            txtGrados.text=ciudadQuito.grados.toString();
            txtEstadoClima.text=ciudadQuito.estadoClima;
        }
        else if(nombreCiudad=="Ciudad de Cuenca"){
            txtCiudad.text=ciudadCuenca.nombreCiudad;
            txtGrados.text=ciudadCuenca.grados.toString();
            txtEstadoClima.text=ciudadCuenca.estadoClima;

        }
        else{
            Toast.makeText(this, "No se encuentra la ciudad", Toast.LENGTH_SHORT).show();
        }



    }
}
package com.aplicacion.appclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Activity_ciudad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudad)

        val btnClimaQuito=findViewById<Button>(R.id.btnClimaQuito);
        val btnClimaCuenca=findViewById<Button>(R.id.btnClimaCuenca);
        val TAG="NombreCiudad";

        btnClimaQuito.setOnClickListener(View.OnClickListener {
            /*Toast.makeText(this,"Quito",Toast.LENGTH_SHORT).show();*/
            val intentQuito=Intent(this,MainActivity::class.java);
            intentQuito.putExtra(TAG,"Ciudad de Quito");
            startActivity(intentQuito);
        });

        btnClimaCuenca.setOnClickListener(View.OnClickListener {
           /*Toast.makeText(this,"Cuenca",Toast.LENGTH_SHORT).show();*/
            val intentQuito=Intent(this,MainActivity::class.java);
            intentQuito.putExtra(TAG,"Ciudad de Cuenca");
            startActivity(intentQuito);

        });



    }
}
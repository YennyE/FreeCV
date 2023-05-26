package com.example.freecv

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class PrincipalActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val btnGOIniciarSesion = findViewById<Button>(R.id.btnInicioSesion)
        btnGOIniciarSesion.setOnClickListener { goToInicioSesion() }

        val btnGoRegistro = findViewById<Button>(R.id.btnRegistrar)
        btnGoRegistro.setOnClickListener { goToRegistro() }

    }
    private fun goToInicioSesion(){
        val i= Intent(this, LoginActivity::class.java)
        startActivity(i)
    }
    private fun goToRegistro(){
        val i = Intent(this, RegistroActivity::class.java)
        startActivity(i)
    }
}
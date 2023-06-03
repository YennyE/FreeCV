package com.example.freecv

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val goToPrincipal = findViewById<TextView>(R.id.textViewVolver)
        goToPrincipal.setOnClickListener { goToPPrincipal() }

    }
    private fun goToPPrincipal(){
        val i = Intent(this, PrincipalActivity::class.java)
        startActivity(i)

    }
}
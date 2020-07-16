package com.augustomontc.igtipaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Tela2Activity : AppCompatActivity() {
    var aluno: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        aluno = intent.getStringExtra("aluno") as String
        val txtAluno = findViewById<TextView>(R.id.txtAluno)
        txtAluno.text = "Aluno: $aluno"
    }
}
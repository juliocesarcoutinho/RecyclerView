package com.juliocoutinho.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    
    private lateinit var rvListagem : RecyclerView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val listagem = listOf(
            ListaNomes(
                "Miriã",
                "Hoje eu fui para a praia",
                "05:00"
            ),
            ListaNomes(
                "Rebekah",
                "Feliz em estar aqui na praia",
                "10:02"
            ),
            ListaNomes(
                "Priscila",
                "Com a familia fica tudo melhor",
                "10:09"
            ),
            ListaNomes(
                "Julio",
                "Meus sacrificios valeram a pena",
                "04:00"
            )
        )
        
        rvListagem = findViewById(R.id.rv_listagem)
        rvListagem.adapter = ListagemAdapter(listagem)
        rvListagem.layoutManager = LinearLayoutManager(this)
        
    }
}
package com.example.tarea01

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Enlazamos el TextView del XML con nuestro código
        val asciiTextView = findViewById<TextView>(R.id.asciiTextView)

        val asciiArt = """
                 _nnnn_
                dGGGGMMb
               @p~qp~~qMb
               M|@||@) M|
               @,----.JM|
              JS^\__/  qKL
             dZP        qKRb
            dZP          qKKb
           fZP            SMMb
           HZM            MMMM
           FqM            MMMM
         __| ".        |\dS"qML
         |    `.       | `' \Zq
        _)      \.___.,|     .'
        \____   )MMMMMP|   .'
             `-'       `--'
        """.trimIndent()

        // Asignamos el dibujo a la pantalla
        asciiTextView.text = asciiArt
    }
}

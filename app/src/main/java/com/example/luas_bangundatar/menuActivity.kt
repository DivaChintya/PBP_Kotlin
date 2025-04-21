package com.example.luas_bangundatar

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class menuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val persegi = findViewById<ImageView>(R.id.imageView)
        val lingkaran = findViewById<ImageView>(R.id.imageView2)
         val segitiga = findViewById<ImageView>(R.id.imageView3)

        persegi.setOnClickListener {
            startActivity(Intent(this, persegiActivity::class.java))
        }

        lingkaran.setOnClickListener {
            startActivity(Intent(this, lingkaranActivity::class.java))
        }

        segitiga.setOnClickListener {
            startActivity(Intent(this, segitigaActivity::class.java))
        }

    }
}

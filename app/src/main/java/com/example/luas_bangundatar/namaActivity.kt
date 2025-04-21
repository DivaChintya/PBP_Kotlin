package com.example.luas_bangundatar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NamaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nama) // menghubungkan ke layout activity_nama.xml

        val nextButton = findViewById<Button>(R.id.next)

        nextButton.setOnClickListener {
            val intent = Intent(this, SplashActivity::class.java)
            startActivity(intent)
            finish() // jika ingin menghapus NamaActivity dari backstack
        }
    }
}

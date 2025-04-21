package com.example.luas_bangundatar

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Handler untuk delay selama 2 detik (2000 ms)
        Handler(Looper.getMainLooper()).postDelayed({
            // Pindah ke activity selanjutnya
            val intent = Intent(this, menuActivity::class.java) // Ganti MainActivity sesuai target
            startActivity(intent)
            finish() // Tutup splash agar tidak bisa kembali ke sini
        }, 2000)
    }
}
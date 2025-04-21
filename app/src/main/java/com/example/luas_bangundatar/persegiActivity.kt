package com.example.luas_bangundatar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class persegiActivity : AppCompatActivity() {

    // Deklarasi view
    private lateinit var inputSisi: EditText
    private lateinit var tombolHitung: Button
    private lateinit var hasilLuas: TextView
    private lateinit var hasilKeliling: TextView
    private lateinit var tombolKembali: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi)

        // Inisialisasi view dari XML
        inputSisi = findViewById(R.id.inputSisi)
        tombolHitung = findViewById(R.id.hitungP)
        hasilLuas = findViewById(R.id.hasilLuasP)
        hasilKeliling = findViewById(R.id.hasilKelP)
        tombolKembali = findViewById(R.id.kembaliP) // <- Tambahan


        tombolHitung.setOnClickListener {
            hitungLuasDanKelilingPersegi()
        }

        // Fungsi tombol kembali ke menuActivity
        tombolKembali.setOnClickListener {
            val intent = Intent(this, menuActivity::class.java)
            startActivity(intent)
            finish() // opsional, biar tidak bisa balik ke persegiActivity
        }
    }

    private fun hitungLuasDanKelilingPersegi() {
        val sisiText = inputSisi.text.toString()

        if (sisiText.isNotEmpty()) {
            try {
                val sisi = sisiText.toDouble()
                val luas = sisi * sisi
                val keliling = 4 * sisi

                hasilLuas.text = luas.toString()
                hasilKeliling.text = keliling.toString()

            } catch (e: NumberFormatException) {
                hasilLuas.text = "Input tidak valid"
                hasilKeliling.text = "-"
            }
        } else {
            hasilLuas.text = "Sisi belum diisi"
            hasilKeliling.text = "-"
        }
    }
}

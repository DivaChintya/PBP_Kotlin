package com.example.luas_bangundatar

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class lingkaranActivity : AppCompatActivity() {

    private lateinit var inputJariJari: EditText
    private lateinit var tombolHitung: Button
    private lateinit var hasilLuas: TextView
    private lateinit var hasilKeliling: TextView
    private lateinit var tombolKembali: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lingkaran)

        // Inisialisasi view dari layout
        inputJariJari = findViewById(R.id.inputJari2) // nanti kita ubah ID ini di bawah
        tombolHitung = findViewById(R.id.hitungL)
        hasilLuas = findViewById(R.id.hasilLuasL)
        hasilKeliling = findViewById(R.id.hasilKelL)
        tombolKembali = findViewById(R.id.kembaliL)

        // Operasi ketika tombol hitung diklik
        tombolHitung.setOnClickListener {
            hitungLingkaran()
        }

        // Navigasi kembali ke menu
        tombolKembali.setOnClickListener {
            val intent = Intent(this, menuActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun hitungLingkaran() {
        val jariText = inputJariJari.text.toString()

        if (jariText.isNotEmpty()) {
            try {
                val jari = jariText.toDouble()
                val luas = Math.PI * jari * jari
                val keliling = 2 * Math.PI * jari

                hasilLuas.text = String.format("%.2f", luas)
                hasilKeliling.text = String.format("%.2f", keliling)
            } catch (e: NumberFormatException) {
                hasilLuas.text = "Input tidak valid"
                hasilKeliling.text = "Input tidak valid"
            }
        } else {
            hasilLuas.text = "Jari-jari belum diisi"
            hasilKeliling.text = "Jari-jari belum diisi"
        }
    }
}

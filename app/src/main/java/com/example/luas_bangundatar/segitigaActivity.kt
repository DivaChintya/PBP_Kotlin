package com.example.luas_bangundatar // GANTI DENGAN NAMA PACKAGE KAMU

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class segitigaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)

        val inputAlas = findViewById<EditText>(R.id.inputAlas)
        val btnHitung = findViewById<Button>(R.id.hitungS)
        val txtHasilLuas = findViewById<TextView>(R.id.hasilLuasS)
        val txtHasilKeliling = findViewById<TextView>(R.id.hasilKelilingS)
        val tombolKembali = findViewById<ImageView>(R.id.kembaliS)

        // Fungsi tombol kembali ke menuActivity
        tombolKembali.setOnClickListener {
            val intent = Intent(this, menuActivity::class.java)
            startActivity(intent)
            finish() // opsional, biar tidak bisa balik ke persegiActivity
        }

        btnHitung.setOnClickListener {
            val alasStr = inputAlas.text.toString()

            if (alasStr.isEmpty()) {
                Toast.makeText(this, "Masukkan nilai alas terlebih dahulu", Toast.LENGTH_SHORT).show()
            } else {
                val alas = alasStr.toDoubleOrNull()

                if (alas == null || alas <= 0) {
                    Toast.makeText(this, "Alas harus berupa angka positif", Toast.LENGTH_SHORT).show()
                } else {
                    val tinggi = alas * Math.sqrt(3.0) / 2
                    val luas = 0.5 * alas * tinggi
                    val keliling = 3 * alas

                    txtHasilLuas.text = "%.2f".format(luas)
                    txtHasilKeliling.text = "%.2f".format(keliling)
                }
            }
        }
    }
}

package com.example.ipaterpadu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    private lateinit var btn_kelas7: Button
    private lateinit var btn_kelas8: Button
    private lateinit var btn_kelas9: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btn_kelas7 = findViewById(R.id.btn_kelas7)
        btn_kelas8 = findViewById(R.id.btn_kelas8)
        btn_kelas9 = findViewById(R.id.btn_kelas9)

        btn_kelas7.setOnClickListener({
            val kelas7 = Intent (this@MenuActivity, Kelas7Activity::class.java)
            startActivity(kelas7)
        })

        btn_kelas8.setOnClickListener({
            val kelas8 = Intent (this@MenuActivity, Kelas8Activity::class.java)
            startActivity(kelas8)
        })

        btn_kelas9.setOnClickListener({
            val kelas9 = Intent (this@MenuActivity, Kelas9Activity::class.java)
            startActivity(kelas9)
        })
    }
}
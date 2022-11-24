package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_info_samber.*
import kotlinx.android.synthetic.main.activity_terima_sampah.*

class TerimaSampah : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terima_sampah)

        terimaSampahButtonListener()
    }
    private fun terimaSampahButtonListener() {
        img10.setOnClickListener {
            startActivity(Intent(this, NotifikasiNotiv::class.java))
        }
    }
}
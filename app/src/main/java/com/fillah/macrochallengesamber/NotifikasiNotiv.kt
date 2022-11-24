package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_info_samber.*
import kotlinx.android.synthetic.main.activity_notifikasi_notiv.*

class NotifikasiNotiv : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifikasi_notiv)

        batalButtonListener()
    }
    private fun batalButtonListener() {
        button10.setOnClickListener {
            startActivity(Intent(this, AkhirNotif::class.java))
        }
    }
}
package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_konfirm_recycle.*
import kotlinx.android.synthetic.main.activity_recycle_detail.*

class KonfirmRecycle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfirm_recycle)

        nxtkrButtonListener()
    }
    private fun nxtkrButtonListener() {
        btn1200.setOnClickListener {
            startActivity(Intent(this, AkhirNotif::class.java))
        }
    }
}
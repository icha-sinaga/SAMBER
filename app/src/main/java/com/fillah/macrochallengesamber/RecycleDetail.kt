package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_notifikasi_notiv.*
import kotlinx.android.synthetic.main.activity_recycle_detail.*

class RecycleDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_detail)

        nxtButtonListener()
    }
    private fun nxtButtonListener() {
        btn120.setOnClickListener {
            startActivity(Intent(this, KonfirmRecycle::class.java))
        }
    }
}
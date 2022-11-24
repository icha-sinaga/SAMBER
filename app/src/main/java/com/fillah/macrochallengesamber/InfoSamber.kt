package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_forgot_password.*
import kotlinx.android.synthetic.main.activity_info_samber.*

class InfoSamber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_samber)

        notifButtonListener()
    }
    private fun notifButtonListener() {
        img08.setOnClickListener {
            startActivity(Intent(this, AturNotifikasiActivity::class.java))
        }
    }
}
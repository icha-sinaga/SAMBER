package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class AturNotifikasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atur_notifikasi)
        supportActionBar?.hide()

        backButtonListener()
    }

    private fun backButtonListener() {
        back1.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }

}
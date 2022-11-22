package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.back1
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.hide()

        backButtonListener()
        editProfilListener()
        aturNotifikasiListener()
        keluarListener()

    }

    private fun backButtonListener() {
        back1.setOnClickListener {
            startActivity(Intent(this, InitActivity::class.java))
        }
    }

    private fun editProfilListener() {
        lledit.setOnClickListener {
            startActivity(Intent(this, EditProfilActivity::class.java))
        }
    }

    private fun aturNotifikasiListener() {
        llatur.setOnClickListener {
            startActivity(Intent(this, AturNotifikasiActivity::class.java))
        }
    }

    private fun keluarListener() {
        btnKeluar.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

}
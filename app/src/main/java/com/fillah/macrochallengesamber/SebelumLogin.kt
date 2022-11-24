package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_profile_popup.*
import kotlinx.android.synthetic.main.activity_sebelum_login.*

class SebelumLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sebelum_login)

        butListener()
        artikelListener()
    }

    private fun butListener() {
        log12.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
    private fun artikelListener() {
        about12.setOnClickListener {
            startActivity(Intent(this, MediaActivity::class.java))
        }
    }
}
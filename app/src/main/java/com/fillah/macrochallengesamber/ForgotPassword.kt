package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_forgot_password.*
import kotlinx.android.synthetic.main.activity_init.*

class ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        supportActionBar?.hide()

        backButtonListener()
    }
    private fun backButtonListener() {
        backbutton1.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
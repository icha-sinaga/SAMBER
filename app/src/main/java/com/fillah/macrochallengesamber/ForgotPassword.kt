package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_forgot_password.*
import kotlinx.android.synthetic.main.activity_login.*

class ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

    backLogIButtonListener()
    }
    private fun backLogIButtonListener() {
        backbutton1.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
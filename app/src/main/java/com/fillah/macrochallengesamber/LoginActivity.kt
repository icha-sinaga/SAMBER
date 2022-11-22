package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        backButtonListener()
        registerButtonListener()
        forgotPassListener()
        loginListener()
    }
    //coba2 untuk bantuan
    private fun loginListener() {
        log_1.setOnClickListener {
            startActivity(Intent(this, BantuanActivity::class.java))
        }
    }

    private fun backButtonListener() {
        back1.setOnClickListener {
            startActivity(Intent(this, InitActivity::class.java))
        }
    }
    private fun registerButtonListener() {
        reg2.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
    private fun forgotPassListener() {
        forgot.setOnClickListener {
            startActivity(Intent(this, ForgotPassword::class.java))
        }
    }
}
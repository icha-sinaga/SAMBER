package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        backButton2Listener()
        loginButtonListener()
    }
    private fun backButton2Listener() {
        back2.setOnClickListener {
            startActivity(Intent(this, InitActivity::class.java))
        }
    }
    private fun loginButtonListener() {
        log_2.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
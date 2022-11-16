package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_init.*


class InitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_init)
        supportActionBar?.hide()

        loginButtonListener()
        registerButtonListener()
    }
    private fun loginButtonListener() {
        btn_1.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
    private fun registerButtonListener() {
        btn_2.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
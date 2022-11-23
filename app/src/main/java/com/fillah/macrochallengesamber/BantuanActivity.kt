package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.back1
import kotlinx.android.synthetic.main.activity_bantuan.*

class BantuanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bantuan)
        supportActionBar?.hide()

        backButtonListener()
        faqListener()
        csListener()
    }

    //Coba Profile
    private fun csListener(){
        cs.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }


    private fun backButtonListener() {
        back1.setOnClickListener {
            startActivity(Intent(this, InitActivity::class.java))
        }
    }

    private fun faqListener(){
        faq.setOnClickListener() {
            startActivity(Intent(this, FaqActivity::class.java))
        }
    }
}
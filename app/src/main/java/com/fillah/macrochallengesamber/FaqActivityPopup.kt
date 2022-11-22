package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_profile_popup.*
import kotlinx.android.synthetic.main.activity_faq_popup.*
import kotlinx.android.synthetic.main.activity_login.back1

class FaqActivityPopup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faq_popup)
        supportActionBar?.hide()

        backButtonListener()
        okListener()
    }

    private fun backButtonListener() {
        back1.setOnClickListener {
            startActivity(Intent(this, FaqActivity::class.java))
        }
    }

    private fun okListener() {
        btnOk1.setOnClickListener {
            startActivity(Intent(this, FaqActivity::class.java))
        }
    }
    }

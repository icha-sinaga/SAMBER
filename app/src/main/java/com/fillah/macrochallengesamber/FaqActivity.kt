package com.fillah.macrochallengesamber

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.PopupWindow
import kotlinx.android.synthetic.main.activity_faq.*
import kotlinx.android.synthetic.main.activity_faq_popup.*
import kotlinx.android.synthetic.main.activity_login.back1

class FaqActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faq)
        supportActionBar?.hide()

        backButtonListener()
        submitListener()
    }

    private fun backButtonListener() {
        back1.setOnClickListener {
            startActivity(Intent(this, BantuanActivity::class.java))
        }
    }

    private fun submitListener() {
        submit.setOnClickListener {
            startActivity(Intent(this, FaqActivityPopup::class.java))
        }
    }
}

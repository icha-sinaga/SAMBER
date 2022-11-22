package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_profile_popup.*
import kotlinx.android.synthetic.main.activity_edit_profile_popup.back1
import kotlinx.android.synthetic.main.activity_login.*

class EditProfilePopup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile_popup)
        supportActionBar?.hide()

        backButtonListener()
        okListener()
    }

    private fun backButtonListener() {
        back1.setOnClickListener {
            startActivity(Intent(this, EditProfilActivity::class.java))
        }
    }

    private fun okListener() {
        btnOk2.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}
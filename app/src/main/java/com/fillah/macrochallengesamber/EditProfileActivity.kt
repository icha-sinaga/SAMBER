package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fillah.macrochallengesamber.fragment.ProfileFragment
import kotlinx.android.synthetic.main.activity_edit_profile.*
import kotlinx.android.synthetic.main.activity_login.back1

class EditProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        supportActionBar?.hide()

        backButtonListener()
        simpanButtonListener()
    }

    private fun backButtonListener() {
        back1.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }

    private fun simpanButtonListener() {
        btnSimpan.setOnClickListener {
            startActivity(Intent(this, ProfileFragment::class.java))
        }
    }
}
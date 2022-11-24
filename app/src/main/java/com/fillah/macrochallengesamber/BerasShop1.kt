package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_beras_shop1.*
import kotlinx.android.synthetic.main.activity_shop_act2.*

class BerasShop1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beras_shop1)

        pesanButtonListener()
    }
    private fun pesanButtonListener() {
        button13.setOnClickListener {
            startActivity(Intent(this, BerasShop2::class.java))
        }
    }
}
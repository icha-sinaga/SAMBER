package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_shop_act2.*

class ShopAct2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_act2)

        beliButtonListener()
    }

    private fun beliButtonListener() {
        button11.setOnClickListener {
            startActivity(Intent(this, BerasShop1::class.java))
        }

    }
}
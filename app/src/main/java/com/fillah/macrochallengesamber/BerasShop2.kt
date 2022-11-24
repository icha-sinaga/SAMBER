package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_beras_shop2.*
import kotlinx.android.synthetic.main.activity_shop_act2.*

class BerasShop2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beras_shop2)

        yaButtonListener()
        tidakButtonListener()
    }
    private fun yaButtonListener() {
        ya1.setOnClickListener {
            startActivity(Intent(this, AkhirShop::class.java))
        }
    }
    private fun tidakButtonListener() {
        tidak1.setOnClickListener {
            startActivity(Intent(this, ShopAct2::class.java))
        }
    }
}

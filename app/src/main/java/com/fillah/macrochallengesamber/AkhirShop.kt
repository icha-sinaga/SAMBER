package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_akhir_shop.*
import kotlinx.android.synthetic.main.activity_login.*

class AkhirShop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akhir_shop)

        ok2ButtonListener()
    }

    private fun ok2ButtonListener() {
        button12.setOnClickListener {
            startActivity(Intent(this, ShopAct2::class.java))
        }
    }
}
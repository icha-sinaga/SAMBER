package com.fillah.macrochallengesamber

import android.content.Intent
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.latihantablayout.RiwayatAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.back1
import kotlinx.android.synthetic.main.activity_riwayat.*

class RiwayatActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2
    /*private lateinit var toolbar: Toolbar*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)


        viewPager.adapter = RiwayatAdapter(this)
        TabLayoutMediator(tabLayout, viewPager) { tab, index ->
            tab.text = when (index) {
                0 -> {
                    "Penukaran Sampah"
                }
                1 -> {
                    "Penukaran Poin"
                }
                else -> {
                    throw Resources.NotFoundException("The Menu Not Found") }
            }



        }.attach()

        backButtonListener()
    }

    private fun backButtonListener() {
        back1.setOnClickListener {
            startActivity(Intent(this, InitActivity::class.java))
        }
    }

}
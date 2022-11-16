package com.fillah.macrochallengesamber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import kotlinx.android.synthetic.main.activity_on_boarding.*

class OnBoarding : AppCompatActivity() {

    private val introSlideAdapter = IntroSlideAdapter(
        listOf(
            IntroSlide(
                "Sampah Plastik Jadi Koin",
                "Kumpulkan sampah plastikmu dan tukar menjadi koin",
                R.drawable.gambar1
            ),
            IntroSlide(
                "Kemudahan Mengelola Sampah Plastik",
                "Penjemput sampah plastik akan datang sesuai waktu dan tempat yang kamu tentukan",
                R.drawable.gambar2
            ),
            IntroSlide(
                "Belanja Sembako Dan Barang Daur Ulang",
                "Koin yang sudah terkumpul dapat dipakai untuk belanja sembako dan barang daur ulang melalui Samber",
                R.drawable.gambar3
            ),
            IntroSlide(
                "Bantuan Samber",
                "Tersedia bantuan Samber untuk solusi dari permasalahanmu terkait Samber",
                R.drawable.gambar4
            )
        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
        supportActionBar?.hide()
        page1.adapter = introSlideAdapter
        setupIndicator()
        setCurrentIndicator(0)
        page1.registerOnPageChangeCallback(object : OnPageChangeCallback() {

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicator(position)
            }
        })
        font2.setOnClickListener {
            if (page1.currentItem + 1 < introSlideAdapter.itemCount) {
                page1.currentItem +=1
            }
            else {
                Intent(applicationContext, InitActivity::class.java).also {
                    startActivity(it)
                    finish()
                }
            }
        }
    }

    private fun setupIndicator () {
        val indicators = arrayOfNulls<ImageView>(introSlideAdapter.itemCount)
        val layoutParams: LinearLayout.LayoutParams =
            LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
        layoutParams.setMargins(8,0,8,0)
        for(i in indicators.indices) {
            indicators[i] = ImageView(applicationContext)
            indicators[i].apply {
                this?.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicaor_inactive
                    )
                )
                this?.layoutParams = layoutParams
            }
            linear1.addView(indicators[i])
        }
    }
    private fun setCurrentIndicator(index: Int) {
        val childCount = linear1.childCount
        for(i in 0 until childCount) {
            val imageView = linear1[i] as ImageView
            if(i == index) {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_active
                    )
                )
            }
            else{
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicaor_inactive
                    )
                )
            }
        }
    }
}
package com.fillah.macrochallengesamber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.replace
import com.fillah.macrochallengesamber.databinding.ActivityMainBinding
import com.fillah.macrochallengesamber.fragment.HomeFragment
import com.fillah.macrochallengesamber.fragment.NotificationFragment
import com.fillah.macrochallengesamber.fragment.ProfileFragment
import com.fillah.macrochallengesamber.fragment.RecycleFragment
import kotlinx.android.synthetic.main.activity_navigation2.*

class NavigationAct : AppCompatActivity() {

    private val homeFragment = HomeFragment()
    private val recycleFragment = RecycleFragment()
    private val notificationFragment = NotificationFragment()
    private val profileFragment = ProfileFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation2)
        replaceFragment(homeFragment)

        bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.home -> replaceFragment(homeFragment)
                R.id.recycle -> replaceFragment(recycleFragment)
                R.id.notif -> replaceFragment(notificationFragment)
                R.id.profil -> replaceFragment(profileFragment)
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_layout, fragment)
            transaction.commit()
        }
    }
}
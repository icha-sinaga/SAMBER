package com.example.latihantablayout

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.fillah.macrochallengesamber.FragmentRiwayatSampah
import com.fillah.macrochallengesamber.FragmentRiwayatPoin

class RiwayatAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity){

    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {FragmentRiwayatSampah()}
            1 -> {FragmentRiwayatPoin()}
            else -> { throw Resources.NotFoundException("The Menu Not Found")}
        }
    }

}
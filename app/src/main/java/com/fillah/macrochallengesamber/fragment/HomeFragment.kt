package com.fillah.macrochallengesamber.fragment

import android.app.ActionBar
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fillah.macrochallengesamber.HomeAdapter
import com.fillah.macrochallengesamber.HomeModel
import com.fillah.macrochallengesamber.R
import kotlinx.android.synthetic.main.fragment_home2.*

class HomeFragment : Fragment() {
    private lateinit var actionBar: ActionBar;
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home2, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = arrayListOf<HomeModel>(
            HomeModel("About Samber", "Samber hanya tersedia di Kota Surabaya", "Nantikan kehadiran Samber di kotamu"),
            HomeModel("About Samber", "Ada kendala di Samber ?", "Hubungi Customer Service"),
            HomeModel("About Samber", "F.A.Q. Samber", "Pertanyaan seputar Samber"),

        )
        view1.adapter = HomeAdapter(this@HomeFragment.context, list)
    }
}
package com.fillah.macrochallengesamber.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fillah.macrochallengesamber.AturNotifikasiActivity
import com.fillah.macrochallengesamber.EditProfileActivity
import com.fillah.macrochallengesamber.LoginActivity
import com.fillah.macrochallengesamber.R
import kotlinx.android.synthetic.main.fragment_profile2.*

class ProfileFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//
//        val bind = FragmentHome2Binding.inflate(layoutInflater)
//
//        bind.root.lyt03.setOnClickListener {
//            val intent = Intent(this@ProfileFragment.requireContext(),EditProfilActivity::class.java)
//            startActivity(intent)
//        }
        return inflater.inflate(R.layout.fragment_profile2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        edit12.setOnClickListener {
            startActivity(Intent(this@ProfileFragment.activity, EditProfileActivity::class.java))
        }
        btnKeluar.setOnClickListener {
            startActivity(Intent(this@ProfileFragment.activity, LoginActivity::class.java))
        }
        llatur.setOnClickListener {
            startActivity(Intent(this@ProfileFragment.activity, AturNotifikasiActivity::class.java))
        }
    }
}
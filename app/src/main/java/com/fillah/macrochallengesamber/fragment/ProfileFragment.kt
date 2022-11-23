package com.fillah.macrochallengesamber.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fillah.macrochallengesamber.InitActivity
import com.fillah.macrochallengesamber.OnBoarding
import com.fillah.macrochallengesamber.ProfileActivity
import com.fillah.macrochallengesamber.R
import kotlinx.android.synthetic.main.activity_login.*

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_profile, container, false)
    }

}




package com.fillah.macrochallengesamber.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fillah.macrochallengesamber.EditProfileActivity
import com.fillah.macrochallengesamber.InfoSamber
import com.fillah.macrochallengesamber.R
import com.fillah.macrochallengesamber.TerimaSampah
import kotlinx.android.synthetic.main.fragment_notification2.*
import kotlinx.android.synthetic.main.fragment_profile2.*

class NotificationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notification2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        samber1.setOnClickListener {
            startActivity(Intent(this@NotificationFragment.activity, InfoSamber::class.java))
        }
        sampah1.setOnClickListener {
            startActivity(Intent(this@NotificationFragment.activity, TerimaSampah::class.java))
        }
    }
}
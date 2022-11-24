package com.fillah.macrochallengesamber

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.card_samber.view.*

class HomeAdapter(private val context: Context?, private val homeModelArrayList: ArrayList<HomeModel>) :
    PagerAdapter() {
    override fun getCount(): Int {
        return homeModelArrayList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val view = LayoutInflater.from(context).inflate(R.layout.card_samber, container, false)

        val model = homeModelArrayList[position]
        val tile = model.title
        val description = model.description
        val description2 = model.description2

        view.text06.text = tile
        view.text07.text = description
        view.text08.text = description2

        view.setOnClickListener {
            Toast.makeText(context, "$tile \n $description \n $description2", Toast.LENGTH_SHORT).show()
        }

        container.addView(view, position)

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

}
package com.fillah.macrochallengesamber

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class IntroSlideAdapter(private val introSlides: List<IntroSlide>)
    : RecyclerView.Adapter<IntroSlideAdapter.IntorSlideViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntorSlideViewHolder {
        return IntorSlideViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.slide_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: IntorSlideViewHolder, position: Int) {
        holder.bind(introSlides[position])
    }

    override fun getItemCount(): Int {
        return introSlides.size
    }

    inner class IntorSlideViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val textTitle = view.findViewById<TextView>(R.id.txtv1)
        private val textDesc = view.findViewById<TextView>(R.id.desc1)
        private val imageIcon = view.findViewById<ImageView>(R.id.imgv1)

        fun bind(introSlide: IntroSlide) {
            textTitle.text = introSlide.title
            textDesc.text = introSlide.description
            imageIcon.setImageResource(introSlide.icon)
        }
    }
}
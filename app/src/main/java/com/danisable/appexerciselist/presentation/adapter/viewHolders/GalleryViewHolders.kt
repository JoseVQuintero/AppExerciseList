package com.danisable.appexerciselist.presentation.adapter.viewHolders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.danisable.appexerciselist.R

class GalleryViewHolders(private val view: View): RecyclerView.ViewHolder(view) {
    //val txvName = view.findViewById(R.id.txvName) as TextView
    val txvDescription = view.findViewById(R.id.txvDescription) as TextView
    val imageAvatar = view.findViewById(R.id.imgAvatar) as ImageView
    //Glide.with(context).load(artist.image).into(imgAvatar)
}
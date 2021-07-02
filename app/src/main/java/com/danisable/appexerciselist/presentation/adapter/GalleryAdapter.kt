package com.danisable.appexerciselist.presentation.adapter

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.danisable.appexerciselist.R
import com.danisable.appexerciselist.domain.model.Gallery
import com.danisable.appexerciselist.presentation.adapter.listener.ListenerGallery
import com.danisable.appexerciselist.presentation.adapter.viewHolders.GalleryViewHolders


class GalleryAdapter(
    private val context: Context,
    private val gallery: ArrayList<Gallery>,
    private val listener: ListenerGallery
): RecyclerView.Adapter<GalleryViewHolders>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolders {
        return GalleryViewHolders(LayoutInflater.from(parent.context).inflate(R.layout.items_gallery, parent, false))
    }

    override fun getItemCount(): Int = gallery.size

    override fun onBindViewHolder(holder: GalleryViewHolders, position: Int) {
        val gallery = gallery[position]
        //holder.txvName.text = gallery.title
        holder.txvDescription.text = gallery.description
        //holder.imageAvatar.setImageResource(artist.image)
        Glide.with(context).load(gallery.image).into(holder.imageAvatar)
        /*holder.itemView.setOnClickListener{
            listener.onClickNews(news,)
        }*/
        /*holder.itemView.setOnClickListener { v ->
            val activity = v!!.context as AppCompatActivity
            val newsDFragment = NewsDFragment()
            val sm = activity.supportFragmentManager.beginTransaction()

            sm.apply {
                setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)

                val bundle = Bundle()
                //bundle.putSerializable("news", news)
                //bundle.putString("title", news.title)
                bundle.putString("description", gallery.description)
                bundle.putString("image", gallery.image)
                Log.e("TAG",gallery.image)
                newsDFragment.arguments = bundle

                replace(R.id.container, newsDFragment)
                addToBackStack(null)
                commit()
            }
        }*/

    }
}

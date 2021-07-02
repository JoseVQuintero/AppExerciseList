package com.danisable.appexerciselist.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.danisable.appexerciselist.domain.model.Gallery
import androidx.recyclerview.widget.LinearLayoutManager
import com.danisable.appexerciselist.R
import com.danisable.appexerciselist.presentation.adapter.GalleryAdapter
import com.danisable.appexerciselist.presentation.adapter.listener.ListenerGallery
import com.danisable.appexerciselist.presentation.adapter.listener.ListenerNews
import com.danisable.appexerciselist.presentation.data.gallery.Gallery.getGallery
import kotlinx.android.synthetic.main.fragment_gallery.view.*


class GalleryFragment : Fragment(), ListenerGallery {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_gallery, container, false)
        val adapter = GalleryAdapter(view.context, getGallery(), this)
        view.rvGallery.setHasFixedSize(true)
        view.rvGallery.layoutManager = LinearLayoutManager(
            view.context,
            LinearLayoutManager.VERTICAL,
            false
        )
        view.rvGallery.layoutManager = GridLayoutManager(view.context,3)
        view.rvGallery.adapter = adapter
        return view
    }

    override fun onClickGallery(gallery: Gallery) {
        TODO("Not yet implemented")
    }
}
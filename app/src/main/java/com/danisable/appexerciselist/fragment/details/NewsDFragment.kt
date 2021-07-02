package com.danisable.appexerciselist.fragment.details

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.danisable.appexerciselist.R
import com.danisable.appexerciselist.presentation.data.news.News
import kotlinx.android.synthetic.main.fragment_news_details.*
import kotlinx.android.synthetic.main.fragment_news_details.view.*
import java.util.*


class NewsDFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_news_details, container, false)


        val data: Bundle = requireArguments()
        //var news = data.getSerializable("news") as News
        val title = data.getString("title")
        val description = data.getString("description")
        val image = data.getString("image")

        Glide.with(view).load(image.toString()).into(view.imgAvatar)
        view.txvName.text = title.toString()
        view.txvDescription.text = description.toString()

        return view
    }

}
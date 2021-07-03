package com.danisable.appexerciselist.fragment.details

import android.os.Bundle

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.danisable.appexerciselist.R
import com.danisable.appexerciselist.domain.model.News
import kotlinx.android.synthetic.main.fragment_news_details.*
import kotlinx.android.synthetic.main.fragment_news_details.view.*
import java.util.*


class NewsDFragment : Fragment() {

    //cuando se crea la vista
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_news_details, container, false)


        /*val title = data.getString("title")
        val description = data.getString("description")
        val image = data.getString("image")*/

        /*Glide.with(view).load(image.toString()).into(view.imgAvatar)
        view.txvName.text = title.toString()
        view.txvDescription.text = description.toString()*/

        //Log.e("TAG",news.toString())

        //return view
    //}

    //cuando la vista esta creada
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = arguments?.getSerializable("news") as News
        //Log.e("Tag",data.title.toString())

        Glide.with(view).load(data.image.toString()).into(view.imgAvatar)
        view.txvName.text = data.title.toString()
        view.txvDescription.text = data.description.toString()

        /*val title = arguments?.getString("title")
        val description = arguments?.getString("description")
        val image = arguments?.getString("image")

        Glide.with(view).load(image).into(view.imgAvatar)
        view.txvName.text = title.toString()
        view.txvDescription.text = description.toString()*/
    }

}
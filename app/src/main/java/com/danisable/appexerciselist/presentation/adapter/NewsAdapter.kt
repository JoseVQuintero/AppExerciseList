package com.danisable.appexerciselist.presentation.adapter

import android.os.Bundle
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.danisable.appexerciselist.R
import com.danisable.appexerciselist.domain.model.News
import com.danisable.appexerciselist.fragment.details.NewsDFragment
import com.danisable.appexerciselist.presentation.adapter.listener.ListenerNews
import com.danisable.appexerciselist.presentation.adapter.viewHolders.NewsViewHolders

class NewsAdapter(
    private val context: Context,
    private val news: ArrayList<News>,
    private val listener:ListenerNews): RecyclerView.Adapter<NewsViewHolders>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolders {
        return NewsViewHolders(LayoutInflater.from(parent.context).inflate(R.layout.items_news, parent, false))
    }

    override fun getItemCount(): Int = news.size

    override fun onBindViewHolder(holder: NewsViewHolders, position: Int) {
        val news = news[position]
        holder.txvName.text = news.title
        holder.txvDescription.text = news.description
        //holder.imageAvatar.setImageResource(artist.image)
        Glide.with(context).load(news.image).into(holder.imageAvatar)
        /*holder.itemView.setOnClickListener{
            listener.onClickNews(news,)
        }*/
        holder.itemView.setOnClickListener { v ->
            val activity = v!!.context as AppCompatActivity
            val newsDFragment = NewsDFragment()
            val sm = activity.supportFragmentManager.beginTransaction()

            sm.apply {
                setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)

                val bundle = Bundle()
                //bundle.putSerializable("news", news)
                bundle.putString("title", news.title)
                bundle.putString("description", news.description)
                bundle.putString("image", news.image)
                Log.e("TAG",news.image)
                newsDFragment.arguments = bundle

                replace(R.id.container, newsDFragment)
                addToBackStack(null)
                commit()
            }
        }

    }
}
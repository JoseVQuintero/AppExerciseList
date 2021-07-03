package com.danisable.appexerciselist.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.danisable.appexerciselist.R.*
import com.danisable.appexerciselist.domain.model.News
import com.danisable.appexerciselist.fragment.details.NewsDFragment
import com.danisable.appexerciselist.main.MainActivity
import com.danisable.appexerciselist.presentation.adapter.NewsAdapter
import com.danisable.appexerciselist.presentation.adapter.listener.ListenerNews
import com.danisable.appexerciselist.presentation.data.news.News.getNews
import kotlinx.android.synthetic.main.fragment_news.view.*


class NewsFragment : Fragment(), ListenerNews {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(layout.fragment_news, container, false)
        val adapter = NewsAdapter(view.context, getNews(), this)
        view.rvNews.setHasFixedSize(true)
        view.rvNews.layoutManager = LinearLayoutManager(
            view.context,
            LinearLayoutManager.VERTICAL,
            false
        )
        //rvArtists.layoutManager = GridLayoutManager(this,3)
        view.rvNews.adapter = adapter
        return view
    }

    override fun onClickNews(news: News) {
        val bundle = Bundle()
        bundle.putSerializable("news",news)
        /*bundle.putString("title",news.title)
        bundle.putString("description",news.description)
        bundle.putString("image",news.image)*/
        (context as MainActivity).replaceFragment(NewsDFragment(), bundle)
    }


}


package com.danisable.appexerciselist.presentation.adapter.listener

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.danisable.appexerciselist.domain.model.News

interface ListenerNews {
    fun onClickNews(news: News)
}
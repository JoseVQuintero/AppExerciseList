package com.danisable.appexerciselist.presentation.adapter.listener

import com.danisable.appexerciselist.domain.model.News

interface ListenerNews {
    fun onClickNews(news: News)
}
package com.danisable.appexerciselist.domain.model

import android.os.Parcelable
import java.io.Serializable

data class News (
    val title: String,
    val description: String,
    val image: String
): Serializable
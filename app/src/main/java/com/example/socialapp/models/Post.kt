package com.example.socialapp.models

import android.graphics.Bitmap
import android.widget.ImageView

data class Post(
    val text: String = " ",
    val createdBy: User = User(),
    val createdAt: Long = 0L,
    val likedBy: ArrayList<String> = ArrayList(),


)


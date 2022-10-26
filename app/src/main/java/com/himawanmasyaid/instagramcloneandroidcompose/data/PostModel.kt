package com.himawanmasyaid.instagramcloneandroidcompose.data

import com.himawanmasyaid.instagramcloneandroidcompose.R

data class PostModel(
    val id: Int,
    val account: AccountModel,
    val caption: String = "",
    val location: String = "",
    val picture: Int = 0,
    val likesCount: Int = 0,
    val commentsCount: Int = 0,
    val isLike: Boolean = false,
    val isSaved: Boolean = false
)

fun getPostList(): List<PostModel> {
    return listOf(
        PostModel(
            id = 1,
            account = accountDetail(id = 1),
            caption = "The game in Japan was amazing and I want to share some photos",
            location = "Tokyo, Japan",
            picture = R.drawable.img_tokyo,
            likesCount = 44000,
            commentsCount = 0,
        ),
        PostModel(
            id = 2,
            account = accountDetail(id = 1),
            caption = "Start our story",
            location = "Bali, Indonesia",
            picture = R.drawable.img_couple,
            likesCount = 89000,
            commentsCount = 100,
        ),
        PostModel(
            id = 3,
            account = accountDetail(id = 2),
            caption = "Berjalan bersama lifepack",
            location = "Kajarta, Wakanda",
            picture = R.drawable.img_walk_lifepack,
            likesCount = 5500,
            commentsCount = 0,
        ),
    )
}

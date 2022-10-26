package com.himawanmasyaid.instagramcloneandroidcompose.data

import com.himawanmasyaid.instagramcloneandroidcompose.R

data class StoryModel(
    val id: Int,
    val account: AccountModel,
    val picture: Int = 0,
)

fun getStoryList(): List<StoryModel> {
    return listOf(
        StoryModel(
            id = 1,
            account = accountDetail(1),
            picture = R.drawable.img_story_flower
        ),
        StoryModel(
            id = 2,
            account = accountDetail(2),
            picture = R.drawable.img_story_party
        ),
        StoryModel(
            id = 3,
            account = accountDetail(1),
            picture = R.drawable.img_story_drink_coffee
        ),

    )
}

fun storyDetail(id: Int): StoryModel {
    val response = getStoryList().findLast { it.id == id }
    return response ?: StoryModel(0, AccountModel(0))
}
package com.himawanmasyaid.instagramcloneandroidcompose.data

import com.himawanmasyaid.instagramcloneandroidcompose.R

data class AccountModel(
    val id: Int,
    val username: String = "",
    val fullName: String = "",
    val profilePicture: Int = R.drawable.ic_road,
)

fun getAccountList(): List<AccountModel> {
    return listOf(
        AccountModel(
            id = 1,
            username = "himawan.masyaid",
            fullName = "Umar Syaid Himawan",
            profilePicture = R.drawable.img_himawan_profile
        ),
        AccountModel(
            id = 2,
            username = "lifepack.id",
            fullName = "Apotek Lifepack",
            profilePicture = R.drawable.ic_lifepack_logo

        ),
    )
}

fun accountDetail(id: Int): AccountModel {
    val response = getAccountList().findLast { it.id == id }
    return response ?: AccountModel(id = 0)
}
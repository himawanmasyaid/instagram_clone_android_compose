package com.himawanmasyaid.instagramcloneandroidcompose.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.himawanmasyaid.instagramcloneandroidcompose.data.AccountModel
import com.himawanmasyaid.instagramcloneandroidcompose.R
import com.himawanmasyaid.instagramcloneandroidcompose.data.accountDetail

@Composable
fun StoryCardView(account: AccountModel) {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .widthIn(min = 62.dp, max = 62.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally // center icon & name
    ) {
        // picture
        Box(
            modifier = Modifier
                .size(62.dp),
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_oval_baseline_story),
                contentDescription = null,
                modifier = Modifier
                    .size(62.dp)
            )

            Image(
                painter = painterResource(id = account.profilePicture),
                contentDescription = null,
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape)
                    .align(Alignment.Center) // center item in box
                ,
            )

        }

        // for distance profile image and username
        Divider(
            color = Color.Transparent, // transparent color
            modifier = Modifier
                .height(5.dp)
        )

        Text(
            text = account.username,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis // ellipsis
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewStoryCardView() {
    StoryCardView(
        accountDetail(2)
    )
}
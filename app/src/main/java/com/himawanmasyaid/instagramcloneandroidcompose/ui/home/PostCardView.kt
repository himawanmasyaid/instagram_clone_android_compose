package com.himawanmasyaid.instagramcloneandroidcompose.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.himawanmasyaid.instagramcloneandroidcompose.R
import com.himawanmasyaid.instagramcloneandroidcompose.data.PostModel
import com.himawanmasyaid.instagramcloneandroidcompose.data.postDetail


@Composable
fun PostCardView(post: PostModel = postDetail(1)) {
    Column() {
        // profile picture and username
        Row(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically, // make item center vertical
        ) {
            // profile picture
            Image(
                painter = painterResource(post.account.profilePicture),
                contentDescription = null,
                // size profile picture
                modifier = Modifier
                    .size(32.dp)
                    .clip(CircleShape),
                // content scale
                contentScale = ContentScale.Crop
            )
            // username & location
            Column(
                modifier = Modifier
                    .padding(start = 10.dp, top = 1.dp)
            ) {
                // username
                Text(
                    text = post.account.username,
                )
                // location
                Text(
                    text = post.location,
                )
            }

        }
        // image post
        Image(
            painter = painterResource(id = post.picture),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(450.dp),
            contentScale = ContentScale.Crop
        )
        // action post like, comment, share, & save
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 14.dp, end = 14.dp, top = 12.dp
                ),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Row() {
                var isLike by remember { mutableStateOf(false) }
                Image(
                    painter = painterResource(id = if (isLike) R.drawable.ic_heart_baseline_black else R.drawable.ic_heart_baseline_black),
                    contentDescription = null,
                    modifier = Modifier
                        .width(24.dp)
                        .height(21.dp)
                )

                // comment action
                Image(
                    painter = painterResource(id = R.drawable.ic_comment),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 17.dp)
                        .width(24.dp)
                        .height(21.dp)
                )

                // share action
                Image(
                    painter = painterResource(id = R.drawable.ic_messager),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 17.dp)
                        .width(24.dp)
                        .height(21.dp)
                )
            }

            // save action
            Image(
                painter = painterResource(id = R.drawable.ic_save), contentDescription = null,
                modifier = Modifier
                    .width(24.dp)
                    .height(21.dp)
            )

        }

        // caption
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        ) {
            // span style for username
            val spanStyles = listOf(
                AnnotatedString.Range(
                    SpanStyle(fontWeight = FontWeight.Bold),
                    start = 0,
                    end = post.account.username.length
                )
            )
            Text(
                // set span styles
                text = AnnotatedString(
                    "${post.account.username} \t ${post.caption}",
                    spanStyles = spanStyles
                ),
                modifier = Modifier.padding(end = 10.dp),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPostCardView() {
    PostCardView()
}
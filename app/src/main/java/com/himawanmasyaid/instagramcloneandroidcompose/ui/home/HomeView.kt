package com.himawanmasyaid.instagramcloneandroidcompose.ui.home

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.himawanmasyaid.instagramcloneandroidcompose.R
import com.himawanmasyaid.instagramcloneandroidcompose.ui.theme.InstagramCloneAndroidComposeTheme

@Composable
fun HomeView() {
    Column {
        HomeTopAppBar()
        HomeContentView()
    }
}

@Composable
fun HomeTopAppBar() {
    Row(
        modifier = Modifier
            .height(56.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_instagram_txt_logo),
            contentDescription = "logo",
            modifier = Modifier
                .padding(start = 14.dp, top = 2.dp)
                .height(42.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_messager),
            contentDescription = "direct",
            Modifier
                .padding(end = 14.dp)
                .fillMaxWidth()
                .height(24.dp),
            alignment = Alignment.CenterEnd
        )
    }
}

@Composable
fun HomeContentView(
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    ) {
    LazyColumn(
        modifier = modifier,
        contentPadding = contentPadding,
        ) {
//        HomeStoryList()
//        HomePostList()
    }
}

@Composable
fun HomeStoryList() {
    Row() {

    }
}

@Composable
fun HomePostList() {
    Column() {

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomeView() {
    InstagramCloneAndroidComposeTheme() {
        HomeView()
    }
}





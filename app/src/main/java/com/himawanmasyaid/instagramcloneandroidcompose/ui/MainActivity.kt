package com.himawanmasyaid.instagramcloneandroidcompose.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.himawanmasyaid.instagramcloneandroidcompose.ui.home.HomeView
import com.himawanmasyaid.instagramcloneandroidcompose.ui.theme.InstagramCloneAndroidComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramCloneAndroidComposeTheme {
                // A surface container using the 'background' color from the theme
                HomeView()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    InstagramCloneAndroidComposeTheme {
        Greeting("Android")
    }
}
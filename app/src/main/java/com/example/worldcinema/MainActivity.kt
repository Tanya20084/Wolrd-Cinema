package com.example.worldcinema

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.worldcinema.Domain.Navigation
import com.example.worldcinema.ui.theme.WorldCinemaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WorldCinemaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   //LauchScreen(pad = innerPadding)
                           //SignInScreen()
                    Navigation(pad = innerPadding)
                }
            }
        }
    }
}

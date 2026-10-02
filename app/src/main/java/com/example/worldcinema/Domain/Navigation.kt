package com.example.worldcinema.Domain

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.worldcinema.Data.Splash_Screen
import com.example.worldcinema.LauchScreen
import com.example.worldcinema.SignInScreen
import kotlinx.coroutines.delay

@Composable
fun Navigation(pad : PaddingValues) {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Splash_Screen){
        composable<Splash_Screen>{
            LauchScreen(pad)
            LaunchedEffect(key1 = Unit) {
                delay(timeMillis = 2000L)
                navController.navigate(route = "second")
            }
        }
        composable(route = "second"){
            SignInScreen()
        }
    }

}


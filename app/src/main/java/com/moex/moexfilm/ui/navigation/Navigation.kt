package com.moex.moexfilm.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.moex.moexfilm.ui.screens.LoginScreen

@Composable
fun Navigation() {

    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = "login"){
        composable("login"){
            LoginScreen()
        }
    }

}
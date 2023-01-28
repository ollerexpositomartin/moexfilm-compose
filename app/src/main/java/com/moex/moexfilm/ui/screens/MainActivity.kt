package com.moex.moexfilm.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.moex.moexfilm.ui.Navigation
import com.moex.moexfilm.ui.theme.MoexfilmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoexfilmTheme {
                    Navigation()
            }
        }
    }
}
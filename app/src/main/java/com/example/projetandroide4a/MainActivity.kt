package com.example.projetandroide4a

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.projetandroide4a.ui.theme.ProjetAndroidE4ATheme
import com.example.projetandroide4a.view.TvSeriesScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjetAndroidE4ATheme {
                TvSeriesScreen()
            }
        }
    }
}
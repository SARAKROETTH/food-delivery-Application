package com.example.applicationjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.applicationjetpackcompose.ui.theme.ApplicationJetPackComposeTheme

class MainActivity : ComponentActivity() {
//    OnCreate inite state of activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            ApplicationJetPackComposeTheme {
                LoginScreen()
            }
        }
    }

    @Composable
    fun LoginScreen(){
        Text(text = "Login Screen")
    }
}


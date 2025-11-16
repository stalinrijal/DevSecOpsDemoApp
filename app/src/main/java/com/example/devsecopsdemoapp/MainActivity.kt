package com.example.devsecopsdemoapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.devsecopsdemoapp.ui.theme.DevSecOpsDemoAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Intentionally insecure usage for demonstration only (DevSecOps lab)
        Log.d("DevSecOpsDemo", "Using API key: ${ApiKeys.API_KEY}")

        setContent {
            DevSecOpsDemoAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Text(text = "Hello DevSecOps")
                }
            }
        }
    }
}
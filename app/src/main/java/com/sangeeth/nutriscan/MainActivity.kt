package com.sangeeth.nutriscan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sangeeth.nutriscan.ui.theme.ComposeLoadingAnimationsTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeLoadingAnimationsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(
                        contentAlignment = Alignment.Center
                    ){
                        BlurredAnimatedText(
                            modifier = Modifier
                                .size(200.dp)
                                .align(Alignment.Center)
                        )
                        Column (
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Text(
                                text = "NutriScan",
                                color = Color.White,
                                fontSize = 30.sp,
                                fontFamily = FontFamily(Font(R.font.jetbrainsmono_bold)),
                                modifier = Modifier
                                    .padding(top = 250.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}
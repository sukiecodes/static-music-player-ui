package com.example.cs501staticmusicplayerui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Scaffold
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cs501staticmusicplayerui.ui.theme.CS501StaticMusicPlayerUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CS501StaticMusicPlayerUITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MusicPlayer(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MusicPlayer(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .wrapContentSize()
            .padding(5.dp)
        ,
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
            // changes the background color of card from default grey to white
        )
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image( // album cover
                painter = painterResource(R.drawable.album),
                contentDescription = null
            )

            Text(
                text = "BIRDS OF A FEATHER",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Text(text = "Billie Eilish")
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth(0.60f)
                    // trying to make the divider mimic a time bar
                    .height(10.dp)
            )

            Row( // row of all the buttons for music
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White
                    )
                ) {
                    Image(
                        painter = painterResource(R.drawable.shuffle),
                        contentDescription = null,
                        modifier = modifier
                            .size(30.dp)
                    )
                }

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White
                    )
                ) {
                    Image(
                        painter = painterResource(R.drawable.reverse),
                        contentDescription = null,
                        modifier = modifier
                            .size(30.dp)
                    )
                }

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White
                    )
                ) {
                    Image(
                        painter = painterResource(R.drawable.play),
                        contentDescription = null,
                        modifier = modifier
                            .size(30.dp)
                    )
                }

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White
                    )
                ) {
                    Image(
                        painter = painterResource(R.drawable.forward),
                        contentDescription = null,
                        modifier = modifier
                            .size(28.dp)
                    )
                }

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White
                    )
                ) {
                    Image(
                        painter = painterResource(R.drawable.repeat),
                        contentDescription = null,
                        modifier = modifier
                            .size(30.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MusicPlayerPreview() {
    CS501StaticMusicPlayerUITheme {
        MusicPlayer()
    }
}
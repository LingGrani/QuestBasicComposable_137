package com.example.questbasiccomposable_137

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable_137.ui.theme.QuestBasicComposable_137Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_137Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicLayout(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicLayout(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = modifier.fillMaxSize()
    ) {
        Text(
            text = "Login",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp
            )
        )
        Text(
            text = "Ini adalah Halaman login",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Black
            )
        )
        Image(
            painter = painterResource(id = R.drawable.umy),
            contentDescription = "umylogo",
            modifier = Modifier.size(200.dp)
        )
        Text(
            text = "Nama"
        )
        Text(
            text = "Luthfi Angger Ramdhani",
            style = TextStyle(
                fontSize = 20.sp,
                color = Color(255,0,0)
            )
        )
        Text(text = "20220140137")
        Image(
            painter = painterResource(id = R.drawable.foto),
            contentDescription = "foto",
        )
    }
}

package com.example.questbasiccomposable_137

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.questbasiccomposable_137.ui.theme.QuestBasicComposable_137Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_137Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicLayout(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicLayout(name: String, modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ){
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        Text(
            text = "How are you?",
            modifier = modifier
        )
        Text(
            text = "I'm fine, thank you!",
            modifier = modifier
        )
        Text(
            text = "What's your name?",
            modifier = modifier
        )
        Text(
            text = "My name is ...",
            modifier = modifier
        )
        Text(
            text = "Nice to meet you!",
            modifier = modifier
        )
        Text(
            text = "Bye!",
            modifier = modifier
        )
    }
}


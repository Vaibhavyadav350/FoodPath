package com.example.foodpath

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodpath.ui.theme.FoodPathTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodPathTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFFD0BCFF)) {
                    IntroScreen()
                }
            }
        }
    }
}

@Composable
fun IntroScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {

            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Image Description",
                modifier = Modifier
                    .size(300.dp)  // Set the desired size
                    .padding(8.dp)
            )
            Text(text = "Embark on India's \n Culinary Trail.", style = MaterialTheme.typography.headlineMedium, modifier = Modifier.padding(8.dp))
            Text(text = "Explore, savor, and rediscover \n regional delights.", style = MaterialTheme.typography.bodyMedium, modifier = Modifier.padding(8.dp))
            ElevatedButton(onClick = { /* navigate to dashboard or login */ }, modifier = Modifier.padding(8.dp)) {
                Text(text = "Explore Now")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FoodPathTheme {
        IntroScreen()
    }
}
package com.example.joejet

import android.os.Bundle
import android.util.SparseArray
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.joejet.ui.theme.JoejetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test()

        }
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Preview(showBackground = true)
@Composable
fun Test(){
    Column(
        modifier = Modifier
            // .padding(10.dp)
            .background(Color.Green)
            .fillMaxSize()


    ) {
        Text(text = "Stay safe folks", fontSize = 25.sp,color = Color.Red, fontFamily = FontFamily.Serif,
            fontStyle = FontStyle.Italic)

        Spacer(modifier = Modifier
            .height(40.dp)
        )

        Text(text = "This is busy pc", fontWeight = FontWeight.ExtraBold)

    }
}
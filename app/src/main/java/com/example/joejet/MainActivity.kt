package com.example.joejet

import android.content.Intent
import android.os.Bundle
import android.util.SparseArray
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
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
    val contact = LocalContext.current


    Column(
        modifier = Modifier
            // .padding(10.dp)
            .background(Color(0x6FFF9800))
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {
        Text(text = "Stay safe folks", fontSize = 25.sp,color = Color(0xFF5D5E64), fontFamily = FontFamily.Serif,
            fontStyle = FontStyle.Italic, modifier = Modifier.background(color = Color.Black))

        Spacer(modifier = Modifier
            .height(40.dp)
        )

        Text(text = "This is busy pc", fontWeight = FontWeight.ExtraBold, modifier = Modifier.background(color = Color(0xff)))
        
        Spacer(modifier = Modifier.height(10.dp))
        
        Button(onClick = {
                         contact.startActivity(Intent(contact, ContactActivity::class.java)) //Code for navigation of screens


        },
            colors = ButtonDefaults.buttonColors(Color(0xFF222221)),
            shape = CutCornerShape(10.dp)



        )


        {
            Text(text = "Services")


        }

        Image(
            modifier = Modifier
                .border(3.dp, Color.Black)
                .size(100.dp)
                .clip(RoundedCornerShape(10.dp)),
            painter = painterResource(id = R.drawable.car1),
            contentDescription = "",
           // modifier = Modifier.size(200.dp) *to modify image size




        )
        
        
        Text(text = "A rolling stone gathers no moss")
        Text(text = "Time is relative")
        Text(text = "I need a Quantum Computer")

    }
}
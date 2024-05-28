package com.example.joejet

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.joejet.ui.theme.JoejetTheme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            About()
            
        }
    }
}



@Preview(showBackground = true)
@Composable
fun About(){
    val contact = LocalContext.current

    Column(
        modifier = Modifier


    ) {
        Text(text = "This is the About screen")

        Image(
            modifier = Modifier
                .border(3.dp, Color.Cyan)
                .size(100.dp)
                .clip(RoundedCornerShape(10.dp)),
            painter = painterResource(id = R.drawable.mansion),
            contentDescription = ""
        )

        

        Button(onClick = {
            contact.startActivity(Intent(contact, ContactActivity::class.java))


        },


            )
        {
            Text(text = "Contact")

        }




















    }

    
    
}
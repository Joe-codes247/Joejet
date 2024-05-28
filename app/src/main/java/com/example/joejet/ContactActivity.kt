package com.example.joejet

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.joejet.ui.theme.JoejetTheme

class ContactActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Speed()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun Speed() {
    val login = LocalContext.current

    var name by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var password by remember {
        mutableStateOf(TextFieldValue(""))
    }

LazyColumn(

) {
    item {
        Column(
            modifier = Modifier
                .background(Color(0xFFaba72f))
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,


            ) {

            Image(
                painter = painterResource(id = R.drawable. login),
                contentDescription = ""

            )
            Text(text = "LOGIN", fontWeight = FontWeight.ExtraBold)

            Text(text = "Come back with your ID", color = Color(0xFF2b9595))

            Text(text = "For easy, fast and secure login", fontSize = 10.sp, color = Color(0xFF2b9595))

            OutlinedTextField(
                value = name,
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color.Red,
                    focusedBorderColor = Color.Green,
                    focusedLabelColor = Color.Green,

                    ),
                onValueChange = {name = it},
                label = { Text(text = "Name")},
                //modifier = Modifier.height(100.dp), *To increase type area


            )

            Spacer(modifier = Modifier.height(10.dp))

            OutlinedTextField(
                value = password,
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color.Red,
                    focusedBorderColor = Color.Green,
                    focusedLabelColor = Color.Green,

                    ),
                onValueChange = {password = it},
                label = { Text(text = "Password")},
                visualTransformation = PasswordVisualTransformation(), //To hide passwords

            )

            Button(onClick = {
                login.startActivity(Intent(login, MainActivity::class.java))



            },

                colors = ButtonDefaults.buttonColors(Color(0xFF2b9595)),
                shape = CircleShape



            )



            {
                Text(text = "Login")


            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "Forgot password ?", color = Color(0xFF2b9595), fontSize = 10.sp)

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "OR", fontWeight = FontWeight.ExtraLight, fontSize = 30.sp)

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "Not a member ? Sign up")







































        }



    }



}






    }



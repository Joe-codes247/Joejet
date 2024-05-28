package com.example.joejet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.joejet.ui.theme.JoejetTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class ServicesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jet()

        }
    }
}



@Preview(showBackground = true)
@Composable
fun Jet() {
    var search by remember {
        mutableStateOf(TextFieldValue(""))
    }


LazyColumn(
    modifier = Modifier
        .fillMaxSize()
) {
    item {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Red)

        ) {

            Text(text = "Location")

            Row(
                modifier = Modifier
                    .background(color = Color.Red)
            ) {
                Image(
                    modifier = Modifier
                        .size(20.dp)
                    ,
                    painter = painterResource(id = R.drawable.icon),
                    contentDescription = "",
                )

                Text(text = "New York, USA")

                Image(
                    modifier = Modifier
                        .size(15.dp)
                    ,
                    painter = painterResource(id = R.drawable.nicon),
                    contentDescription = "",
                )
            }

            Row(

            ) {




                OutlinedTextField(
                    value = search,
                    colors = OutlinedTextFieldDefaults.colors(
                        //     unfocusedBorderColor = Color.Red,
                        //   focusedBorderColor = Color.Green,
                        // focusedLabelColor = Color.Green,

                    ),
                    onValueChange = {search = it},
                    label = { Text(text = "Search")},
                    //modifier = Modifier.height(100.dp), *To increase type area
                )

            }

            Column(
                modifier = Modifier
                    .background(color = Color.White)
                    .fillMaxSize()

            ) {

                Text(text = "#SpecialForYou")

                Spacer(modifier = Modifier.height(30.dp))

                Image(
                    modifier = Modifier
                        .fillMaxSize()
                    ,
                    painter = painterResource(id = R.drawable.hostess),
                    contentDescription = ""

                )

                Spacer(modifier = Modifier.height(30.dp))

                Text(text = "Category")

                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier
                        .fillMaxSize()



                ) {

                    Image(
                        modifier = Modifier
                            .size(50.dp)
                        ,
                        painter = painterResource(id = R.drawable.cloth),
                        contentDescription = "",


                    )

                    Spacer(modifier = Modifier.width(50.dp))

                    Image(
                        modifier = Modifier
                            .size(50.dp)
                        ,
                        painter = painterResource(id = R.drawable.electronics),
                        contentDescription = ""

                    )

                    Spacer(modifier = Modifier.width(50.dp))

                    Image(
                        modifier = Modifier
                            .size(50.dp)

                        ,
                        painter = painterResource(id = R.drawable.shoes),
                        contentDescription = "",

                    )

                    Spacer(modifier = Modifier.width(50.dp))

                    Image(
                        modifier = Modifier
                            .size(50.dp)
                        ,
                        painter = painterResource(id = R.drawable.watch),
                        contentDescription = "",

                    )

























                }










            }














        }






















































        }


    }

}























































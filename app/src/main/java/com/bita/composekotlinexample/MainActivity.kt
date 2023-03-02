package com.bita.composekotlinexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

import com.bita.composekotlinexample.ui.theme.ComposeKotlinExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeKotlinExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.error
                ) {
                    MessageCard("Vitoca", contentMessage = "Hello, this is my first experience whit jetpack compose")
                }
            }
        }
    }
}



@Composable
fun MessageCard(author: String, contentMessage: String) {

    Row (modifier = Modifier.padding(all = 8.dp)){
        Image(
            painterResource(id = R.drawable.profile), 
            contentDescription = stringResource(id = R.string.img_description), 
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape))
        Spacer(modifier = Modifier.width(8.dp))
        
        Column {
            Text(text = author, color = Color.Black, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = contentMessage, fontStyle = FontStyle.Italic)
        }
        
    }

}

@Preview
@Composable
fun DefaultPreview() {
        MessageCard("Vitor", "Hello, this is my first experience whit jetpack compose")
}
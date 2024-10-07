package com.example.labstoo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.labstoo.ui.theme.LabsTooTheme
import androidx.compose.runtime.*
import androidx.compose.material3.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.dp
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LabsTooTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable

fun Greeting(name: String, modifier: Modifier = Modifier) {
//    var text by remember { mutableStateOf("Нажмите одну из кнопок") }
//
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = text)
//
//        Spacer(modifier = Modifier.height(100.dp))
//    }
//
//
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp),
//        horizontalArrangement = Arrangement.Center,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Button(onClick = {
//            text = "Первая кнопка была нажата"
//        }) {
//            Text("Нажать")
//        }
//
//        Spacer(modifier = Modifier.width(16.dp))
//
//        Button(onClick = {
//            text = "Вторая кнопка была нажата"
//        }) {
//            Text("Нажать")
//        }
//
//        Spacer(modifier = Modifier.width(16.dp))
//
//        Button(onClick = {
//            text = "Третья кнопка была нажата"
//        }) {
//            Text("Нажать")
//        }
//    }
//}
    var counter by remember { mutableStateOf(1) }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "$counter",
            modifier = Modifier
        )

        Button(onClick = {
            counter = counter + 1
        }) {
            Text("Нажмите на кнопку, чтобы увеличить число")
        }
    }



}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LabsTooTheme {
        Greeting("Android")
    }
}
package com.example.columaplication

import android.os.Bundle
import androidx.compose.ui.unit.dp
import android.provider.SyncStateContract
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.columaplication.ui.theme.ColumAplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                app()
        }
    }
}

@Preview
@Composable
fun app() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .background(Color.Blue)
    ) {
        item {
            Column(modifier = Modifier.fillMaxSize().background(Color.Blue)) {
                Image(
                    modifier = Modifier.fillMaxWidth().height(400.dp),
                    painter = painterResource(id = R.drawable.mi_foto),
                    contentDescription = "Mi foto"
                )
                Text(
                    text = "Practica 3", fontSize = 32.sp,
                    color = Color.Magenta,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Text(text = "Primer Parcial", color = Color.Black)
                Text(text = "App Moviles", color = Color.Black)

                LazyRow(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth().padding(16.dp)
                ) {
                    item {
                        Text(text = "C++", color = Color.Black)
                        Text(text = "Java", color = Color.Black)
                        Text(text = "Python", color = Color.Black)
                        Text(text = "TIID_04_02_UPP", color = Color.Black)
                        Text(text = "TIID_04_02_UPP", color = Color.Black)
                        Text(text = "TIID_04_02_UPP", color = Color.Black)
                        Text(text = "TIID_04_02_UPP", color = Color.Black)
                    }
                }
            }
        }
    }
}
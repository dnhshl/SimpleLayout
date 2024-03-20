package com.example.simplelayout

import android.inputmethodservice.Keyboard.Row
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplelayout.ui.theme.SimpleLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleLayoutTheme {
                MyScreen()
            }
        }
    }
}

@Composable
fun MyScreen() {
    Box(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            .background(Color.Gray),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Button (onClick = { /* TODO */ }
            ) {
                Text("Klick mich")
            }
            Text(stringResource(id = R.string.listTitle), style = MaterialTheme.typography.headlineLarge)
            Box(modifier = Modifier.fillMaxHeight(0.6F)) {
                LazyColumn {
                    items(100) { i ->
                        RowWithIconAndText(sometext = stringResource(id = R.string.listEntry, i))
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(stringResource(id = R.string.listCaption), style = MaterialTheme.typography.labelSmall)
        }
    }
}

@Composable
fun RowWithIconAndText(sometext: String) {
    Row (
      modifier = Modifier.background(Color.Yellow)
    ) {
        Icon(imageVector = Icons.Default.CheckCircle, contentDescription = null)
        Spacer(modifier = Modifier.width(10.dp))
        Text(sometext)
    }
}

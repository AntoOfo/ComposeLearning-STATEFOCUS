package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// composable to handle water counter
// the STATE of this composable is the variable "count"
@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    // use mutableStateOf & remember instead of just count = 0
    // this remembers most recent states during recompositions
    var count by remember { mutableStateOf(0) }

    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "You've had $count glasses.",
            modifier = modifier.padding(16.dp)
        )
        Button(
            onClick = { count++ },  // when clicked, count adds 1
            Modifier.padding(top = 8.dp)
        ) {
            Text("Add one")
        }
    }
}
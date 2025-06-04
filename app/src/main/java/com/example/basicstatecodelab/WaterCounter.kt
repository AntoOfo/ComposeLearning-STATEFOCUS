package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
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
@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    // use mutableStateOf & remember instead of just count = 0
    // this remembers most recent states during recompositions
    var count by remember { mutableStateOf(0) }


    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0) {
            // tracks if task item should be shown
            var showTask by remember { mutableStateOf(true)}
            if (showTask) {
                WellnessTaskItem(
                    onClose = { showTask = false },
                    taskName = "Have you taken your 15 minute walk today?"
                )
            }
            Text("You've had $count glasses")
        }

        Row(Modifier.padding(top = 8.dp)) {
            Button(
                onClick = { count++ }, enabled = count < 10) {
                Text("Add one")
            }
            Button(
                onClick = { count = 0 },
                Modifier.padding(start = 8.dp)) {
                Text("Clear water count")
            }

        }
    }
}
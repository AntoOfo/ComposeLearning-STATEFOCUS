package com.example.basicstatecodelab

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

// this composable will represent the main screen
@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    StatefulCounter(modifier)      // calling the water counter composable
}
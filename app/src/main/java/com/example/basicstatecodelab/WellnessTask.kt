package com.example.basicstatecodelab

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

// represents a single wellness task
class WellnessTask(
    val id: Int,
    val label: String,
    initialChecked: Boolean = false     // initial checked state
) {
    // mutable state managed by compose
    var checked by mutableStateOf(initialChecked)
}
package com.example.basicstatecodelab

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

// viewmodel that holds and manages the list of wellness tasks
// keeps data separate from the UI
class WellnessViewModel : ViewModel() {

    // list of tasks that's mutable for compose
    private val _tasks = getWellnessTasks().toMutableStateList()

    // gives the ui a version of the list to look at but not change
    val tasks: List<WellnessTask>
        get() = _tasks

    // called to remove a task
    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }
}



private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i")}
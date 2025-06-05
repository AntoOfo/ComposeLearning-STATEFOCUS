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

    // updates the checked state of a task
    fun changeTaskChecked(item: WellnessTask, checked: Boolean) =
        // finds the task in the _tasks list that has the same id as the given value
        _tasks.find { it.id == item.id }?.let { task ->
            // if found, it updates the checked value
            task.checked = checked
        }
}



private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i")}
package ru.spbu.mkn.codelabs.state

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.spbu.mkn.codelabs.state.StatefulCounter
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import ru.spbu.mkn.codelabs.state.WellnessTask
import ru.spbu.mkn.codelabs.state.WellnessTasksList

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefulCounter()

        val list = remember { getWellnessTasks().toMutableStateList() }
        WellnessTasksList(list = list, onCloseTask = { task -> list.remove(task) })
    }
}


private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }

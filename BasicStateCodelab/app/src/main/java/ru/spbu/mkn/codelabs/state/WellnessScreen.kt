package ru.spbu.mkn.codelabs.state

import WellnessViewModel
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.spbu.mkn.codelabs.state.StatefulCounter
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.viewmodel.compose.viewModel
import ru.spbu.mkn.codelabs.state.WellnessTask
import ru.spbu.mkn.codelabs.state.WellnessTasksList

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column(modifier = modifier) {
        StatefulCounter()

        WellnessTasksList(
            list = wellnessViewModel.tasks,
            onCheckedTask = { task, checked ->
                wellnessViewModel.changeTaskChecked(task, checked)
            },
            onCloseTask = { task ->
                wellnessViewModel.remove(task)
            }
        )
    }
}

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }

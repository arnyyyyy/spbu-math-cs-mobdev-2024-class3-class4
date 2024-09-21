import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.spbu.mkn.codelabs.state.StatefulCounter
import androidx.compose.foundation.layout.Column

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTasksList()
    }
}

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.spbu.mkn.codelabs.state.StatefulCounter

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    StatefulCounter(modifier)
}
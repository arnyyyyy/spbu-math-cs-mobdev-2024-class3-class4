data class WellnessTask(val id: Int, val label: String)

fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }
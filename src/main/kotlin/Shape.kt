enum class Shape(val value: Int) {
    ROCK(1), PAPER(2), SCISSORS(3);

    fun isStrongerThan(other: Shape): Boolean {
        return when (this) {
            ROCK -> other == SCISSORS
            PAPER -> other == ROCK
            SCISSORS -> other == PAPER
        }
    }
}

object ShapeHelper {
    fun getShapeByValue(value: Int): Shape {
        return Shape.values().first { s -> s.value == value }
    }
}
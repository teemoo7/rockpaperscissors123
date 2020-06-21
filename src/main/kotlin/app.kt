import kotlinx.coroutines.*

fun main() {
    println("Rock: [1], Paper: [2], Scissors: [3]")
    print("Enter your shape number: ")
    val playerChoice = readLine()!!
    val playerShape = ShapeHelper.getShapeByValue(playerChoice.toInt())
    val computerShape = Shape.values().toList().shuffled().first()
    printAnimation()
    val gameEnd = getGameEnd(playerShape, computerShape)
    println("You played $playerShape and I played $computerShape, $gameEnd")
}

private fun getGameEnd(playerShape: Shape, computerShape: Shape): String {
    return if (playerShape.isStrongerThan(computerShape)) {
        "you win!"
    } else {
        if (computerShape.isStrongerThan(playerShape)) {
            "you lose..."
        } else {
            "it's a draw."
        }
    }
}

private fun printAnimation() {
    val delay = 500L
    print("Rock, Paper, Scissors, ")
    runBlocking {
        delay(delay)
    }
    print("1...")
    runBlocking {
        delay(delay)
    }
    print("2...")
    runBlocking {
        delay(delay)
    }
    println("3...")
}
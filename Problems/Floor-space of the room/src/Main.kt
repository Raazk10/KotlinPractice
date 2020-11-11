import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val ans = scanner.next()

    when(ans) {
        "rectangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            val area = a * b
            println(area)
        }
        "circle" -> {
            val r = scanner.nextDouble()
            val area = 3.14 * r.pow(2)
            println(area)
        }
        "triangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            val c = scanner.nextDouble()
            val area = (0.25 * sqrt( (a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c) ))
            println(area)
        }
        else -> println("Invalid")

    }

}
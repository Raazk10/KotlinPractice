import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val  a = "bravery"
    val b = "loyalty"
    val c = "cunning"
    val d = "intellect"

    val enter = scanner.nextLine()
    when (enter) {
        "gryffindor" -> {
            println(a)
        }
        "hufflepuff" -> {
            println(b)
        }
        "slytherin" -> {
            println(c)

        }
        "ravenclaw" -> {
            println(d)

        }
        else -> {
            println("not a valid house")
        }
    }

}
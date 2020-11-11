import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val num = scanner.nextInt()
    when  {
        num == 0 -> println("no army")
        num in  1..4-> println("few")
        num in  5..9-> println("several")
        num in  10..19-> println("pack")
        num in  20..49-> println("lots")
        num in  50..99-> println("horde")
        num in  100..249-> println("throng")
        num in  250..499-> println("swarm")
        num in  500..999-> println("zounds")
        num >= 1000 -> println("legion")

    }
}
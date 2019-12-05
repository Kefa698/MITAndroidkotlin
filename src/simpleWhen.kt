;fun main(args: Array<String>) {


    var x = 23
    when (x) {
        1, 2 -> {
            println("your value is 1 or 2")
        }
        in 10..30 -> {
            println("your value is 2")
        }
        !in 10..30 -> {
            println("your value is 3")
        }

        else -> {
            println("Value is out of range")
        }
    }
}
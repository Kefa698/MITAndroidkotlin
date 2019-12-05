fun main(args: Array<String>) {

    println("Enter your grade")
    var grade = readLine()!!.toDouble()
    if (grade > 90) {
        println("you have qualified for A level")
    } else {
//         block of code
        println("you are not in A level")
    }

    println("your grade is $grade")


}
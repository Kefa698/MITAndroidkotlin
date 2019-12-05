fun main(args: Array<String>) {

    println("Enter your grade")
    var grade = readLine()!!.toDouble()
    if (grade > 90) {

        if (grade < 94) {
            println("you have qualified for A level")
        } else {
            println("You have Qualified for A+ Level")
        }

    }

    println("your grade is $grade")


}
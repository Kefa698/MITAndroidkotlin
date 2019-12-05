fun main(args: Array<String>) {

    println("Enter your grade")
    var grade = readLine()!!.toDouble()
    if (grade >= 90) {
        println("you have qualified for A level")
    } else if (grade >= 80 && grade < 90) {
        println("You have qualified for B level")
    } else if (grade >= 70 && grade < 80) {
        println("You have qualified for C level")
    } else {
        println("you have failed")
    }

    println("your grade is $grade")


}
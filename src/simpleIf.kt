fun main(args: Array<String>) {

    println("Enter your grade")
    var grade = readLine()!!.toDouble()
    if (grade > 90) {
        println("you have qualified for A level91")
    }
    if (grade >= 50 && grade <= 70) {
        grade = grade + 3
        print("you get extra 3 points")

    }

    println("your grade is $grade")


}
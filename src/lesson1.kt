//program to add two numbers A and b
//check if the sum of A and B is even or odd number


//cdisplay the sum and

//use two functions 1.sum the two numbers 2.check if the sum is even or odd


fun main(args: Array<String>) {
    println("Hello world")
//    data types
//    1.Integers
//    2.strings
//    3.Doubles
//    4.Float
//    5.boolean
//    6.Bitwise
//    7.Hexadema



//    create two variables

    val a=8
    var b=2
//call function
    addTwoNumbers(a, b)

}
//function add numbers
fun addTwoNumbers(a:Int,b:Int){

//  var sum=a+b

    println("sum of $a and $b is ${a+b}" )

    checkEvenOrOdd(a+b)
}
//check if even or odd
fun checkEvenOrOdd(sum:Int){
    if (sum%2==0){
//        even number
        println("Number is even")
    }else{
//        odd number
        println("Number is odd")
    }
}
////function to check if sum is prime number
//fun checkPrimeNumber(sum: Int){
//    var isDivisible=false;
//    for (i in 1..sum/2){
//        if (sum%i==)
//    }


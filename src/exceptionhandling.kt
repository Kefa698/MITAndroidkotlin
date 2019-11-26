import kotlin.ArithmeticException

fun main() {
    divideTwoNumbers(num = 10,num2 = 0)
    println("Another Function")
}
fun divideTwoNumbers(num:Int,num2:Int){
    try {
        var result=num/num2
        println("$num/$num2=$result")
    }catch (e:ArithmeticException){
        println(e)}
}


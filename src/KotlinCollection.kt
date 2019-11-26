//Arrays
//let create array of numbers
fun main(args: Array<String>) {
    var arrayOfNumbers= arrayOf(1,2,3,4,5)
    println(arrayOfNumbers.size-1)
    var names= mutableListOf<String>()
    names.add("Emobilis")
    names.add("Emobilis")
    names.add("Emobilis")
    names.add("Emobilis")
    names.add("Emobilis")
    names.add("Emobilis")

//    ////
//    for (i in 0..arrayOfNumbers.size-1){
//        println(arrayOfNumbers.get(i))
//    }
println("The output is")
    var sum=0
    arrayOfNumbers.forEach {number->
        println(number)
        sum+=number
        println(number)
    }

   println("sum of the numbers are :$sum")


//   sets: unique no duplicates
    println("set of ages")
    var ages= setOf<Int>(20,10,30,30,10)
    ages.forEach{
        println(it)
    }

}


//maps:assignment,
//mutable:collection
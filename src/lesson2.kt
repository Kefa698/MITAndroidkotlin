//control flow
//when
//



fun main(args: Array<String>) {
    println("Enter your country phone code")
    var code= readLine()
//    when
    when(code){
        "254"->{
            println("you came from Kenya")
        }
        "255"->{
            println("you came from Tanzania")
        }
        "256"->{
            println("you came from Uganda")
        }
       else->{
           println("oops you are not from here")
       }
    }

//    input a number print btn 0 and the number
    var x=10
    for (i in 0..x){
        if (i>5){
            break
        }
        println(i)
    }
}

//inline function{assignment]
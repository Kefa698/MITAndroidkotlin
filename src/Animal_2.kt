//with primary constructors
class Animal_2 (name:String,age:Int,owner:String){
    var name=name
    var age=age
    var owner=owner
    init {
        if (age>18){
            println("That is an Adult")
        }else{
            println("That is a kid")
        }
    }
    fun move(movement:String):String{
        return movement
    }
    fun eat(food:String):String{
        return food
    }
    fun info(){
        println("The name is $name age $age owner $owner")
    }


}

fun main(args: Array<String>) {
    val dog2=Animal_2("toa",17,"Kinya")
    dog2.info()
}
//secondary constructors
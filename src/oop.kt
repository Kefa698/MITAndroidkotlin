
//inheritance//polymophism

abstract class Animals(name:String,food:String,movemement:String){

    var name="XX"
    var food="Z"
    var movemement="Y"
    fun getinfo(){
        println("the name $name eats $food and moves by $movemement")
    }
}
class Birds{
    var feathers=true
}

fun main(args: Array<String>) {
    var birds=Birds()
    birds.feathers


}
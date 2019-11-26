class Animal {
    var name: String = "X"
    var age: Int = 8
    var owner: String = "Emobilis"


    fun move(movement: String): String {
        return movement
    }
    fun eat(food:String):String{
        return food
    }
    fun info(){
        println("The name is $name age is $age owner $owner")
    }



}

fun main(args: Array<String>) {
    val dog=Animal()/*object*/
    dog.name="Toa"
    dog.age=10
    dog.owner="Kefa"
    dog.move("walk")
    dog.info()

    val horse=Animal()/*object*/
    horse.name="Winter"
    horse.age=20
    horse.owner="Kinya"
    horse.move("walk")
    horse.info()

}
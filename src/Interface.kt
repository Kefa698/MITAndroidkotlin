interface MyInterface {
    fun greets()
}

class Goodmorning : MyInterface {
    override fun greets() {
        println("hey good morning")
    }
}

    class GoodEvening : MyInterface {
        override fun greets() {
            println("hey good evening")
        }
    }

        class AddNumbers : MyInterface {
            override fun greets() {
                println("My result $(40+90")
            }
        }



    fun main() {
        var hello = Goodmorning()
        hello.greets()

        var evening = GoodEvening()
        evening.greets()
    }

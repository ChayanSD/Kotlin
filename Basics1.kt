
    fun main() {
        //What's the difference between var and val
        //var is like a general variable and can be assigned multiple times and is known as the mutable variable in Kotlin.
        // Whereas val is a constant variable and can not be assigned multiple times and can be Initialized only single time and is known as the immutable variable in Kotlin.
        val num : Int=34
//        num =99 see its give me error , Because val are constant ,You can't reassign it;
        var name: String = "Chayan"
        name = "Jhon"
        println("My name is $name")

        //another type of variable
        var age: Int = 10;
        println(age)
        //Let's learn about Integer data type
        var maxIntegerValue: Int = Int.MAX_VALUE
        var minIntegerValue: Int = Int.MIN_VALUE
        println(maxIntegerValue)
        println(minIntegerValue)



        var x :Int = 0;
        println("${++x}")
        println("${x++}")

        var n =9;
        val text = if(n>0){
            println("Hello")
            "This is text"
        }else{
            println("world")
        }
        println("$text")

    }

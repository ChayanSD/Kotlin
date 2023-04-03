/*
Syntax: fun fun_name(variable_name:Variable Type,same ..)------->void function with parameters
        fun fun_name(): function return type(Int,String etc)
 */


fun main() {
//    val name = "Chayan"
//    sayHello(name)
//    println(getMax(2,3))
    sendMessage(age = 34 , name = "Chayan")
}

fun sayHello(name: String) {
    println("Hello $name")
}

//who is greater the others
fun getMax(a: Int, b: Int): Int {
//    val max = if (a > b) a else b
//    return max
    //short from of this function
    return if (a > b) a else b
}

fun sendMessage(name: String="Chayan", age: Int=21) {
    println("Name is : $name Age is : $age")
}
//You can pass default value in parameter;
//But when you are passing value via function call
//Default value didn't work
//When no value passed , Then the default value worked.
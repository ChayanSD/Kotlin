package Arrays

fun main() {
    val names = arrayOf("hello","hi","chayan")
    println(names.size) //it will print the array size.
    for(name in names){
        println(name)
    }

    val mixArray = arrayOf(1,2,3,4,"Chayan",'x',5,6,7)  //we can mix array in kotlin, That's Interesting.
    for(i in mixArray){
        if(i is Int){
            println("Int are : $i")
        }
//        if(i is String){
//            println("String of the arrays are: $i")
//        }
//        if(i is Char){
//            println("Char is $i")
//        }
    }
}
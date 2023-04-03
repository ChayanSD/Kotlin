fun main() {

    println(sum2(2,3,4,7,3,2,2,11,11))
}

fun sum(a : Int,b : Int,c : Int,d : Int) :Int{
    return a+b+c+d
}

//Same thing we can do via "vararg"
//Vararg is a kotlin keyword ; means variable arguments

fun sum2(vararg numbers: Int) :Int{
    var result : Int = 0
    for (number in numbers){
        result +=number
    }
    return result
}
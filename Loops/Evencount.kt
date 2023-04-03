package Loops

fun main() {
    var num =1
    var lastNum=20
var evenCounter =0
    while (num<=lastNum){
        num++


        if (!Even(num)){
            continue
        }
        evenCounter++
        println(num)
    }
    println("The total even numbers are :$evenCounter")
}
fun Even(number: Int) : Boolean{
    if (number % 2 ==0){
        return true
    }else{
        return false
    }
}
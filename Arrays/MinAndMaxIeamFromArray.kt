package Arrays

fun main() {
 var numbers= arrayOf(1,2,6,4)
    var ans = FindMax(numbers)
//    println(ans)
    println(FindMin(numbers))
}
fun FindMax(numbers: Array<Int>) : Int{
    var max = numbers[0]
    for (i in numbers){
        if(i > max){
            max= i
        }
    }
    return max

}

fun FindMin(num : Array<Int>) : Int{
     var min = num[0]
    for(i in num){
        if(i < min){
            min = i
        }
    }
    return min
}
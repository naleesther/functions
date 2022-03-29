fun main(){
    println("Hello Esther")
    var n=getRemainder(26,7)
    println(n)
    var x=Additional(10,10,10,10)
    println(x)
    Statement("dancing")

}


fun printName(name:String){
    var name="Hello $name"
}
fun getRemainder(num1:Int,num2:Int):Int{
    var num=num1%num2
    return num
}
fun Additional(a:Int,b:Int,c:Int,d:Int):Int{
    var num=a+b+c+d
    return num
}
fun Statement(fact:String){
    println("i enjoy $fact")

}
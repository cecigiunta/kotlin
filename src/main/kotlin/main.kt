fun main(){
    val resultado: Int = suma()   //Opción 1
    //val resultado: Int = suma1()  OPCIÓN 2
    println("$resultado")
}

//Opción 1: Sin while
fun suma(): Int {
    println("Ingrese 1 numero")
    val num1: Int = (readLine())!!.toInt()
    println("Ingrese otro numero")
    val num2: Int = (readLine())!!.toInt()
    println("Ingrese otro numero")
    val num3: Int = (readLine())!!.toInt()
    println("Ingrese otro numero")
    val num4: Int = (readLine())!!.toInt()
    println("Ingrese otro numero")
    val num5: Int = (readLine())!!.toInt()
    return num1 + num2 + num3 + num4 + num5
}
// Opción 2: Con While
fun suma1(): Int{
    var i = 0
    var suma = 0
    while(i < 5){
        print("Ingrese un num")
        val n = readLine()!!.toInt()
        suma = suma + n
        i = i + 1
    }
    return suma
}

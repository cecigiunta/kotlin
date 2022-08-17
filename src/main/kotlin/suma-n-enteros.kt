//Solicitar al usuario un numero N
// Solicitar N numeros enteros
// Retornar la suma de esos enteros

fun main (){
    suma2()
}
fun suma2(){
    //Solicitar al usuario un numero n
    println("Ingrese la cantidad de numeros que vamos a sumar:")
    val numero :Int = (readLine())!!.toInt()

    // solicitar al usuario N numeros enteros
    val numerosIngresados = 1..numero  //Creo un rango de 1 al numero q ingrese
    var total = 0
    for (valor in numerosIngresados){
        println("Ingrese un numero: ")
        var numIngresado :Int = (readLine())!!.toInt()
        total += numIngresado
    }
    //Retornar la suma de esos enteros
    println("La suma de los $numero numeros ingresados es: $total")
}


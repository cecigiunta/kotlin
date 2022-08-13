import kotlin.system.exitProcess
fun main () {
    //EJ2: TABLAS - Ej con excepciones!
    var numero: Int = 0
    while (numero != -1){
        print("Ingrese un numero")
        numero = readLine()!!.toInt()
        try {
            val n: Int? = numero?.toInt()
            if(n != null){
                imprimirTabla(n)
            } else {
                println("no se ingreso un n, saliendo")
                numero = 0
                break
                //exitProcess(1) //SALE DEL PROGRAMA CON EL COD DE ERROR
            }
        } catch (e: NumberFormatException){
            println("Ingresa un numero!!")
            numero = 0
        }
    }
}
fun imprimirTabla(n: Int){
    (1..10).forEach{ numero ->
        println("$n x $numero = ${n * numero}")
    }
}

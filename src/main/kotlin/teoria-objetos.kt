open class Automovil(   //Le ponemos OPEN para que puedan existir subclases
    val marca: String,
    val modelo: String
) {
    var velocidad = 0
    open fun arrancar() {
        println("$marca arrancando!")
        velocidad = 10
    }
    class AutoGas (
        marca: String,
        modelo: String
    ): Automovil (marca, modelo) { //Asi le decimos que es una subclase de Automovil
        var usaGas: Boolean = true
        var nivelGas: Float = 10f
        override fun arrancar() {
            super.arrancar()
            if (usaGas){
                println("usa gas")
            } else {
                println("usa nafta")
            }
        }
    }
}

fun main(){
    val gol = Automovil ("VW", "GOL")
    val yaris = Automovil.AutoGas("Toyota", "Yaris")
    gol.arrancar()
    yaris.arrancar()
    yaris.usaGas = false
}
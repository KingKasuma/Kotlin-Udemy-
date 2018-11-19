package OOP

class Utils {
    fun menosMejorando():Int{
        return 1 menos 2
    }
}

fun suma(num1:Int,num2:Int):Int = num1 + num2

internal infix fun Int.menos(num:Int) = this - num //que solo es visible para los archivos dentro del mismo paquete

fun division(num1: Int,num2: Int) = num1 / num2

fun saludos(nombre:String = "Amigo") = println("Hola $nombre")

fun IntArray.swap(indice1:Int, indice2:Int){
    val temp = this[indice1]

    this[indice1] = this[indice2]

    this[indice2] = temp
}
fun main(args:Array<String>){
    val cadena = "Aldo"
    esCadena("Soy una cadena")
    obtenerTam(cadena)
    obtenerClase("aldo")
    val otro = "aldo otro"

}

fun esCadena(obj:Any){
    if (obj is String){
        println(obj.length)
    }else{
        println("No es una cadena")
    }
}

fun obtenerTam(obj:Any){

    val cadena:String? = obj as? String

    println(cadena?.length)
}

fun obtenerClase(obj:Any){

    val nombreClase = obj::class.java
    println("Tu objeto pertenece pertence a la clase: $nombreClase")

}

fun suma(num1:Int,num2:Int):Int = num1 + num2

infix fun Int.menos(num:Int) = this - num

fun division(num1: Int,num2: Int) = num1 / num2

fun saludos(nombre:String = "Amigo") = println("Hola $nombre")

fun IntArray.swap(indice1:Int, indice2:Int){
    val temp = this[indice1]

    this[indice1] = this[indice2]

    this[indice2] = temp
}
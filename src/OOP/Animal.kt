package OOP

abstract class Animal(var tieneDueño:Boolean, var nombreDueño:String) {

    fun caminar() = println("Caminando")

    abstract fun hablar()

}
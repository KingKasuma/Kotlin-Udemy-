package OOP

class Perro(val nombre:String,var edad:Int,val raza:String):Animal(false,"Ninguno"){

    constructor(nombre: String, raza: String):this(nombre,0,raza)

    override fun hablar() = println("Guau Guau Guau")

}
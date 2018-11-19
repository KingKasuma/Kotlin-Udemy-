package OOP

fun main(args:Array<String>){

    val fido = Perro("Fido","Husky")

    val pulgas = Perro("Pulgas",10,"Pomeranea")

    println("${fido.nombre} tiene ${fido.edad} años y es un ${fido.raza} ademas su dueño es ${fido.nombreDueño}")

    println("${pulgas.nombre} tiene ${pulgas.edad} años y es un ${pulgas.raza} ademas su dueño es ${fido.nombreDueño}")

    val a:Int
    a = 4

    val pelusa = Gato()

    fido.hablar()

    pulgas.hablar()

    pelusa.hablar()

    println("Un Perro tiene ${NUMERO_PATAS} patas")

    /*
    Funciones anonimas
    * */

    val miFuncion = fun() = println("Hola Mundo desde una funcion anonima")
    miFuncion.invoke()


    val numerosPares = Array(10,  { it * 2 }) //expresion lambda

    for (numero in numerosPares){
        print("$numero ")
    }

    /*
    Funciones anonimas
    * */

    //funciones extras

    val persona:Person? = Person("Juan", "Perez", "Hernandez", 23)
    val persona1 = Person("Juan", "Perez", "Hernandez", 23)

    persona?.let{
        val nombre = it.nombre
        val apellidoPaterno = it.apellidoPaterno
        val apellidoMaterno = it.apellidoMaterno
        val edad = it.edad
    }

    val numeros = listOf(1,2,3,4,5,6,7,8,9,10)

    val numerosDuplicados = numeros.map{
        it * 2
    }

    for (numero in numerosDuplicados){
        println(numero)
    }

    println(persona)

    val persona2 = persona1.copy()
    println(persona2)
    println(persona1 == persona2)

    persona1.apply {
        nombre = "maria"
        apellidoMaterno = "mora"
        apellidoPaterno = "sanchez"
        edad = 30
    }
    println(persona1)

    val caja:Box<Any> = Box(Person("algo", "Olivares", "Dominquez",0))

    println("El contenido de la caja es: ${caja.contenido}")

    val padre = Person("Pancho","Villa","Flores",35)
    val madre = Person("Panchita", "Mora", "Rosa", 25)

    val hijo = padre + madre

    println(hijo)

    //funciones extras


}
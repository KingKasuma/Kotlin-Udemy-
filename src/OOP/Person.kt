package OOP

data class Person (var nombre:String, var apellidoPaterno:String, var apellidoMaterno:String, var edad:Int){
    operator fun plus(person: Person):Person{
        return Person("",this.apellidoPaterno, person.apellidoMaterno,15)
    }
}
package com.IanAquino.introkotlin903.temasKotlin

class usuarios() {
    val materia:String=""
}


class usuario2(val id:Int, val nombre:String){
    val materia:String=""
    fun hola(){
        println("Hola")
    }
}

fun main(){
    val alumno = usuarios()
    val alumno2 = usuario2(1,"Carlos")

    println(alumno2.id)
    println(alumno2.nombre)
    alumno2.hola()
}
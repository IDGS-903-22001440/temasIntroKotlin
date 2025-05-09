package com.IanAquino.introkotlin903.temasKotlin

fun main(){
    print("Ingrese el sueldo del empleado:")
    val sueldo = readln().toDouble()
    if(sueldo > 3000){
        print("Debe pagar impuestos")
    }else{
        print("No debe pagar impuestos")
    }

    //When

    val mes = "1"
    when(mes){
        "1" -> println("Enero")
        "2" -> println("Febrero")
        "3" -> println("Marzo")
        "4" -> println("Abril")
        else -> println("Mes no valido")

    }
    //print(1<..<5)
}
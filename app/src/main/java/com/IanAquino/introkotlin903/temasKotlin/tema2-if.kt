package com.IanAquino.introkotlin903.temasKotlin

fun main(){
    print("Ingrese el sueldo del empleado:")
    val sueldo = readln().toDouble()
    if(sueldo > 3000){
        print("Debe pagar impuestos")
    }else{
        print("No debe pagar impuestos")
    }
}
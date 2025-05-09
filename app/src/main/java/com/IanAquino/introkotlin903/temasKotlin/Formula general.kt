package com.IanAquino.introkotlin903.temasKotlin

import kotlin.math.sqrt


fun main(){
    do {
        var x = 0
        print("Ingrese los numeros para realizar la formula general de una ecuación" +
                "\nA= ")
        var a = readln().toDouble()
        println("B= ")
        var b = readln().toDouble()
        println("C= ")
        var c = readln().toDouble()

        var d = (b*b)-4*(a*c)

        if(a==0.0){
            while(a==0.0){
                print("El numero dado para A es invalido, ingrese un valor valido" +
                        "\nA= ")
                var a = readln().toDouble()
            }
        }else if(d<0){
            while(d<0) {
                print(
                    "El numero dado para B es invalido, ingrese un valor valido" +
                            "\nB= "
                )
                var b = readln().toDouble()
            }
        }
        var r1 = (-b + sqrt(d))/(2*a)
        var r2 = (-b - sqrt(d))/(2*a)
        println("Segun los valores dados esta ecuacion tiene dos respuestas")
        println("x1 = "+r1+" y x2 = "+r2)
        x = 1

    }while(x == 0)
}
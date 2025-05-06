package com.IanAquino.introkotlin903.temasKotlin

fun main(){
    do{
    print("Ingrese el numero de la operacion a realizar:" +
            "\n 1)Suma " +
            "\n 2)Resta " +
            "\n 3)Division " +
            "\n 4)Multiplicacion" +
            "\n 5)Salir")
    val num = readln().toInt()
    var fin = 0
    var result = 0.0

        if(num == 1){
            print("Ingrese el primer numero:")
            val num1 = readln().toDouble()
            print("Ingrese el segundo numero:")
            val num2 = readln().toDouble()
            result=num1+num2
            print("El resultado de la operacion es: "+result)
        }else if(num.toInt() == 2){
            print("Ingrese el primer numero:")
            val num1 = readln().toDouble()
            print("Ingrese el segundo numero:")
            val num2 = readln().toDouble()
            result=num1-num2
            print("El resultado de la operacion es: "+result)
        }else if(num.toInt() == 3){
            print("Ingrese el primer numero:")
            val num1 = readln().toDouble()
            print("Ingrese el segundo numero:")
            val num2 = readln().toDouble()
            result= num1/num2
            print("El resultado de la operacion es: "+result)
        }else if(num.toInt() == 4){
            print("Ingrese el primer numero:")
            val num1 = readln().toDouble()
            print("Ingrese el segundo numero:")
            val num2 = readln().toDouble()
            result=num1*num2
            print("El resultado de la operacion es: "+result)
        }else if(num.toInt() == 5) {
                fin = 1
        }
    }while(fin == 0)

}
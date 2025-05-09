package com.IanAquino.introkotlin903.temasKotlin

fun main(){
    /*
practica3= imprimir una piramide de * segun el numero dado por el usuario
n=4
*
**
***
****
*****
cuando se capture un 0 terminar el programa, utilizando puro do-while
 */

    do {
        var p = "*"
        var x = 0
        println("\nDame un numero: \n")
        x = readln().toInt()
        if(x > 0){
            var y = 0
                do{
                    var n = 0
                    do{
                        print(p)
                        n++
                    }while(y>=n)
                    print("\n")
                    y++
                }while(y!=x)}
            else{
                println("Dato no valido")
            }
    }while(x!=0)
}
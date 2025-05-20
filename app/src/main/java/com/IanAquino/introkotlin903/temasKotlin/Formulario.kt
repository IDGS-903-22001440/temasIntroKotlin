package com.IanAquino.introkotlin903.temasKotlin

fun main(){
    var x = 0
    do {
        var e = 0
        var i = 0
        var s = 0
        var n = 0
        var t = 0
        var f = 0
        var j = 0
        var p = 0

        println("Bienvenido al test de personalidad MBTI. Contesta con la opción (a/b).")

        println("1. En una fiesta, tú:")
        println("a) Hablas con muchas personas, incluso desconocidos.")
        println("b) Hablas solo con unos pocos conocidos.")
        when (readLine()?.lowercase()) {
            "a" -> e++
            "b" -> i++
        }

        println("2. Al conocer a un grupo nuvo de personas, tú:")
        println("a) Hablas con ellos.")
        println("b) Esperas a que ellos te hablen primero.")
        when (readLine()?.lowercase()) {
            "a" -> e++
            "b" -> i++
        }

        println("3. Al realizar actividades en equipo, tú:")
        println("a) Hablas con tu equipo y te organizas con ello.")
        println("b) Esperas que alguin mas organice las actividades.")
        when (readLine()?.lowercase()) {
            "a" -> e++
            "b" -> i++
        }

        println("4. ¿Prefieres recibir información a través de:")
        println("a) Hechos y detalles concretos.")
        println("b) Ideas y conceptos.")
        when (readLine()?.lowercase()) {
            "a" -> s++
            "b" -> n++
        }

        println("5. ¿Al comunicarte con los demas prefieres recibir:")
        println("a) Datos especificos.")
        println("b) Ideas y conceptos.")
        when (readLine()?.lowercase()) {
            "a" -> s++
            "b" -> n++
        }

        println("6. ¿Te gusta utilizar redes sociales:")
        println("a) Si.")
        println("b) No.")
        when (readLine()?.lowercase()) {
            "a" -> s++
            "b" -> n++
        }

        println("7. ¿Tomas decisiones basándote en:")
        println("a) Lógica y objetividad.")
        println("b) Sentimientos y valores personales.")
        when (readLine()?.lowercase()) {
            "a" -> t++
            "b" -> f++
        }

        println("8. ¿Al ayudar a una persona lo haces en base a:")
        println("a) Hechos objetivos y comprobados.")
        println("b) Valores personales e ideologicos.")
        when (readLine()?.lowercase()) {
            "a" -> t++
            "b" -> f++
        }

        println("9. ¿Al sustentar tus ideas lo haces con:")
        println("a) Datos comprobados y reales.")
        println("b) Conviccion y apelando a la comprension.")
        when (readLine()?.lowercase()) {
            "a" -> t++
            "b" -> f++
        }

        println("10. ¿Cómo prefieres organizar tu vida?")
        println("a) Con planificación y orden.")
        println("b) De manera flexible y espontánea.")
        when (readLine()?.lowercase()) {
            "a" -> j++
            "b" -> p++
        }

        println("11. ¿Cómo prefieres pasar tu tiempo?")
        println("a) Realizando actividades organizadas en horarios especificos.")
        println("b) Haces lo que se te ocurra en el momento.")
        when (readLine()?.lowercase()) {
            "a" -> j++
            "b" -> p++
        }

        println("12. ¿Al salir de fiesta?")
        println("a) Organizo un plan.")
        println("b) Disfruto del momento sin complicaciones.")
        when (readLine()?.lowercase()) {
            "a" -> j++
            "b" -> p++
        }

        val mbti = StringBuilder()

        mbti.append(if (e >= i) "E" else "I")
        mbti.append(if (s >= n) "S" else "N")
        mbti.append(if (t >= f) "T" else "F")
        mbti.append(if (j >= p) "J" else "P")

        println("Tu tipo de personalidad MBTI es: "+ mbti)

        println("Deseas realizar el test nuevamente")
        println("a) Si")
        println("b) No")
        when (readLine()?.lowercase()) {
            "a" -> x++
            "b" -> x = 0
        }
    }while(x == 0)

}
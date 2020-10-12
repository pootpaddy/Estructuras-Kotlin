
import kotlin.system.exitProcess

//Tarea#2: Estructuras de decisión y ciclicas en Kotlin

fun main() {
    println("\n Tarea#2: Estructuras de decisión y ciclicas en Kotlin ")
    println("\n Elige un ejemplo que deseas ejecutar (escribe el número)")
    println("////////////////////////////////////////////////////////////")
    println("1 - Ejemplo IF ")
    println("2 - Ejemplo IF ELSE")
    println("3 - Ejemplo IF ELSE IF ")
    println("4 - Ejemplo WHEN")
    println("5 - Ejemplo While ")
    println("6 - Ejemplo FOR")
    println("7 - Ejemplo DO - WHILE")
    println("////////////////////////////////////////////////////////////")

    val num = Integer.valueOf(readLine())

    when (num) {

        1 -> si()
        2 -> sielse()
        3 -> sieslesi()
        4 -> cuando()
        5 -> mientras()
        6 -> para()
        7 -> hacermientras()
        0-> exitProcess(0)

        else -> {
            print("\n elige un numero")
            main()
        }

    }

}

    fun si() {
        println("Introduce tu edad")
        var edad = readLine()!!.toInt()
        if (edad > 30)
            println("Eres un adulto")
        println("La condición de este ejemplo es que cuando tu edad es mayor a 30, te dice que eres un adulto.")

    }

    fun sielse() {
        println("Ejemplo - Juego Mecánico")
        println("Introduce tu estatura en cm")
        var estatura = readLine()!!.toInt()

        if (estatura >= 160){
            println("Puedes subirte al juego mecánico")
        }
        else {
            println("Lo siento, no alcanzas la altura mínima")
        }
        println("Este ejemplo cumple con la condición de que si tu estatura es >160 cm te permite ingresar al juego mecanico")
        println("De lo contrario (else), te indica que no alcanzas la altura mínima")
    }

    fun sieslesi() {
        println("Ejemplo - Película Clasificación C ")
        println("Introduce tu edad")
        val edad = readLine()!!.toInt()
        if (edad < 10) {
            println("Eres muy jovén para ver esta película")
        } else if (edad < 15) {
            println(" Puedes verla con autorización de un tutor")
        } else {
            println("Puedes ver la película")
        }
    }

    fun cuando() {

        println("Ejemplo - Digitos de un número ")
        println("Introduce un número")
        val x = readLine()!!.toInt()
        when (x) {
            0 -> println("zero")
            in 1..9 -> println("este número tiene un dígito")
            in 10..99 -> println("este número tiene dos dígitos")
            else -> println("Esté número tiene más de dos digitos")
        }
    }

    fun mientras() {
        println("Ejemplo - Cuenta regresiva")
        println("Introduce un número")
        var x = readLine()!!.toInt()
        while (x > 0) {
            println("Cuenta regresiva: $x")
            x--
        }
        println("Mientras el contador sea mayor a cero se hace la cuenta regresiva")
    }

    fun para() {
        println("Ejemplo - Rango de números ")
        println("Piensa en un rango de números")
        println("Escribe el primer número")
        val n1 = readLine()!!.toInt()
        println("Escribe el segundo número")
        val n2 = readLine()!!.toInt()

        val rangoDeNumeros = n1..n2
        for (numero in rangoDeNumeros) {
            println(numero)
        }
    }

    fun hacermientras() {

        do {
            println("Ejemplo - Bucle para ingresar un número entre 1 y 100")
            println("Introduce un numero entre 1 y 100")
            val numero = readLine()!!.toInt()
        } while(numero !in 1..100)
        println("Este es un número entre 1 y 100")
    }




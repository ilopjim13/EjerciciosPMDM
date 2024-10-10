package org.example.ejercicio6

// Ejercicio 6: "Batalla de Daño Crítico"
// Escribe una función que simule una batalla. El daño crítico se hace
// cuando el ataque es mayor a 50. Si el ataque es mayor a 50, imprime
// "¡Golpe crítico!" y devuelve el daño multiplicado por 2, de lo contrario
// solo devuelve el daño normal.

fun ejercicio6() {
    val ataque = 51
    val critico = batallaCrit(ataque)

    println("Has ejecutado un atauqe de $critico de daño")
}

fun batallaCrit(ataque:Int) :Int {
    if (ataque > 50) {
        println("¡Golpe crítico!")
        return ataque * 2
    }
    return ataque
}
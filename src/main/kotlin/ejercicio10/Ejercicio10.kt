package org.example.ejercicio10

import org.example.ejercicio7.Personaje

// Ejercicio 10: "Simulación de ataque en equipo"
// Crea un programa que simule un ataque en equipo. Cada miembro del
// equipo tiene un daño diferente y todos atacan a un enemigo con vida
// inicial de 500. El programa debe restar la suma de los ataques de todos
// los miembros al enemigo hasta que su vida sea 0 o menor.

fun ejercicio10 () {
    val p1 = Personaje(100, 20)
    val p2 = Personaje(100, 10)
    val p3 = Personaje(100, 70)

    val personajes = listOf(p1, p2, p3)

    val enemigo = Personaje(500, 20)

    combate(personajes, enemigo)

}

fun combate(personajes: List<Personaje>, enemigo:Personaje) {
    var batalla = true

    do {
        val ataqueComb = ataqueCombinado(personajes)
        enemigo.recibeDanio(ataqueComb)
        if (enemigo.vida > 0) {
            val oponente = elegirOponente(personajes)
            val ataqueEnemigo = enemigo.ataque()
            personajes[oponente].recibeDanio(ataqueEnemigo)
        } else {
            println("Habéis derrotado al gran enemigo")
            batalla = false
        }

        if (personajes.all { it.vida == 0 }) {
            println("Habéis sido derrotado")
            batalla = false
        }
    } while (batalla)

}

fun ataqueCombinado(personajes: List<Personaje>):Int {
    var ataqueComb = 0
    personajes.forEach {
        ataqueComb += it.ataque()
    }
    return ataqueComb
}

fun elegirOponente(personajes: List<Personaje>):Int {
    val opcion = personajes.indices
    return opcion.random()

}
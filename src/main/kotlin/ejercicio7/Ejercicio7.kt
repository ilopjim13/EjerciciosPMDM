package org.example.ejercicio7

// Ejercicio 7: "Combate de dos personajes"
// Crea un programa que simule el combate entre dos personajes. Cada
// uno tiene una cantidad de vida y ataque. En cada ronda, el personaje A
// ataca a B y viceversa, restando vida. El combate termina cuando uno de
// los personajes tiene 0 o menos de vida.

fun ejercicio7(){
    val personaje = Personaje(100, 20)
    val enemigo = Personaje(50, 25)

    batalla(personaje, enemigo)

}

fun batalla(personaje: Personaje,enemigo:Personaje):Boolean {
    var batalla = true
    var ganado = false

    while (batalla) {
        val ataqueP1 = personaje.ataque()
        enemigo.recibeDanio(ataqueP1)

        if (enemigo.vida == 0) {
            println("Has derrotado al enemigo!!")
            batalla = false
            ganado = true
        } else {
            val ataqueEnemigo = enemigo.ataque()
            personaje.recibeDanio(ataqueEnemigo)
        }

        if (personaje.vida == 0) {
            println("Has sido derrotado!!")
            batalla = false
        }
    }
    return ganado
}
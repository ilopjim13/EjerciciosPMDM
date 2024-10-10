package org.example.ejercicio9

import org.example.ejercicio7.Personaje
import org.example.ejercicio7.batalla

// Ejercicio 9: "Sistema de Experiencia"
// Escribe un programa que simule el sistema de experiencia de un
// personaje. Cada vez que gane una batalla, aumenta su experiencia en
// 50 puntos. Al llegar a 200 puntos o más, sube de nivel.

fun ejercicio9() {

    val personaje = Personaje(100, 20)
    val enemigo = Personaje(100, 15)

    do {
        if (batalla(personaje, enemigo)) personaje.experiencia += 50
        personaje.resetearStats()
        enemigo.resetearStats()

        if (personaje.experiencia >= 200) {
            personaje.subirNivel()
            println("El personaje ha subido de nivel")
        }

    } while (personaje.nivel < 1)



}
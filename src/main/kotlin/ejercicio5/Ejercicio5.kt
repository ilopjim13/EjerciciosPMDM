package org.example.ejercicio5

// Ejercicio 5: "Determinando el Nivel del Personaje"
// Crea un programa que pida el nivel de un personaje. Si el nivel es menor
// a 10, debe imprimir "Personaje principiante". Si es entre 10 y 20,
// "Personaje intermedio". Si es mayor a 20, "Personaje avanzado".

fun ejercicio5() {

    var nivel = 0

    do {
        print("Introduce el nivel del personaje: ")
        nivel = readln().toIntOrNull() ?: 0
        if (nivel <= 0) println("Error introduce un nivel correcto.")
    } while (nivel <= 0)


    if (nivel < 10) println("Personaje principiante")
    else if (nivel in (10..20)) println("Personaje intermedio")
    else println("Personaje avanzado")
}
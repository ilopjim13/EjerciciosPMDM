package org.example.ejercicio3

// Ejercicio 3: "Multiplicando Ataques"
// Escribe una función llamada multiplicarAtaques que tome un número
// entero como argumento y lo multiplique por 5. Usa esa función para
// calcular y mostrar el daño total de 3 ataques.

fun ejercicio3() {
    val ataque1 = 1
    val ataque2 = 2
    val ataque3 = 3

    println("El daño total de los ataques es de ${multiplicarAtaques(ataque1) + multiplicarAtaques(ataque2) + multiplicarAtaques(ataque3)}")
}

fun multiplicarAtaques(num:Int) :Int {
    return num * 5
}

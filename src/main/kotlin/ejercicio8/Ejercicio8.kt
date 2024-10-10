package org.example.ejercicio8

import org.example.ejercicio7.Personaje

// Ejercicio 8: "Inventario de Objetos"
// Crea un programa que simule un inventario de un personaje usando una
// lista. El personaje puede añadir un objeto al inventario, eliminarlo o
// mostrar los objetos actuales.

fun ejercicio8() {
    val personaje = Personaje(50, 20)
    val item = Item("Espada")

    personaje.agregarItem(item)
    if(item in personaje.inventario) println("El item ha sido agregado al inventario")
    personaje.quitarItem(item)
    if (item !in personaje.inventario) println("El item se ha eliminado del inventario")
}
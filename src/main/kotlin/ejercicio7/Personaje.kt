package org.example.ejercicio7

import org.example.ejercicio8.Item

class Personaje(var vida:Int, private val ataque:Int, val inventario: MutableList<Item> = mutableListOf(), var experiencia: Int = 0, var nivel:Int = 0) {


    companion object {
        const val MAXVIDA = 100
    }

    fun ataque() :Int {
        return ataque
    }

    fun recibeDanio(danio:Int) {
        if (vida - danio >= 0) vida -= danio
        else vida = 0
    }

    //del ejercicio 8

    fun agregarItem(item:Item) {
        inventario.add(item)
    }

    fun quitarItem(item: Item) {
        inventario.remove(item)
    }

    // del ejercicio 9

    fun resetearStats() {
        vida = MAXVIDA
    }

    fun subirNivel() {
        nivel++
        experiencia = 0
    }

}
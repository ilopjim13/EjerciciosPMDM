package org.example.menu

import org.example.ejercicio1.ejercicio1
import org.example.ejercicio10.ejercicio10
import org.example.ejercicio2.ejercicio2
import org.example.ejercicio3.ejercicio3
import org.example.ejercicio4.ejercicio4
import org.example.ejercicio5.ejercicio5
import org.example.ejercicio6.ejercicio6
import org.example.ejercicio7.ejercicio7
import org.example.ejercicio8.ejercicio8
import org.example.ejercicio9.ejercicio9

object Menu {

    fun mostrarMenu() {
        var  opcion = 0
        do {
            println("Ejercicios de kotlin PMDM\n")
            println("1. Ejercicio 1")
            println("2. Ejercicio 2")
            println("3. Ejercicio 3")
            println("4. Ejercicio 4")
            println("5. Ejercicio 5")
            println("6. Ejercicio 6")
            println("7. Ejercicio 7")
            println("8. Ejercicio 8")
            println("9. Ejercicio 9")
            println("10. Ejercicio 10\n")
            println("11. Salir\n")

            opcion = pedirOpcion(11)

            ejecutarMenu(opcion)
        } while (opcion != 11)

    }


    private fun pedirOpcion(opciones:Int):Int {
        var opcion = 0

        do {
            print(">> Selecciona una opción: ")
            opcion = readln().toIntOrNull() ?: 0
            if (opcion !in 1..opciones) println("Error, introduce una opción correcta!!")
        } while (opcion !in (1..opciones))

        return opcion
    }

    private fun ejecutarMenu(opcion:Int) {
        when(opcion) {
            1 -> ejercicio1()
            2 -> ejercicio2()
            3 -> ejercicio3()
            4 -> ejercicio4()
            5 -> ejercicio5()
            6 -> ejercicio6()
            7 -> ejercicio7()
            8 -> ejercicio8()
            9 -> ejercicio9()
            10 -> ejercicio10()
        }
    }
}
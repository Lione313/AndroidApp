package com.gutierrez.dilan.practica_calificada

import org.junit.Test

class Ejercicio01Kotlin {
    @Test //Este codigo escrito indicara que la funcion main
    // es un caso de prueba que la bibliioteca Junit ejecutara
    fun main()  {   //esta es la definicion de una funcion en kotlin
        val entrada = "hello"  //declaracion de una variable entrada de tipo String
        val salida = contador(entrada) //declaracion de una variable que tomara
        // como valor la funcion contador dandole un argumento que es entrada
        val resultado = StringBuilder("{") // Crea un nuevo objeto para contruir
        // la cadena como se solicita en la practica
        salida.forEachIndexed { index, count ->  // itera sobre el array de
            // nombre salida, usando la funcion forEach que nos da el indice
            // para cada caraacter y asu vez tambien el conteo
            if (count > 0) { // inicaliza una condicional, de que si conteo es mayor que 0
                if (resultado.length > 1) { //comprueba si la fucnion StringBiulder
                    // ya tiene contenido o caracteres
                    resultado.append(", ") //
                }
                resultado.append("${index.toChar()}: $count") //Abrimos el array luego agarramos
            // el indice y lo convertimos a char
            }
        }
        resultado.append("}") //Cerramos el StringBUilder con la llave
        println("Ejercicio 1 " + resultado.toString()) } //Convierte la funcion
// StringBuilder a cadena y la imprime
    }
   fun contador(cadena: String): IntArray {   //Declaramos la funcion contaodr
       // con los parametros de cadena como entrada y salida un array
        val frecuencia = IntArray(256) // Declaramos la variable de frecuencia
       // que tendra valor de un array de tamaño 256, e inicaliza todos los valores en 0
        for (caracter in cadena) { //Crea un bucle iterando sobre cada caracter en el array de cadena
            frecuencia[caracter.toInt()]++  //incremnta el valor del caracter
        // dependiendo de la posicion correspondiente en el array
        }
        return frecuencia  //retorna el array de frecuencias
    }


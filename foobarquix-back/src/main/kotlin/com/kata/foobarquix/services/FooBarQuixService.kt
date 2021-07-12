package com.kata.foobarquix.services


import org.springframework.stereotype.Service
import kotlin.streams.toList

@Service
class FooBarQuixService() {

    fun convertNumber(inputNumber: Int): String {
        // Conversion par division en priorité
        val result = "${convertNumberDivise(inputNumber)}${convertNumberTransform(inputNumber)}"

        // Si le nombre n'est pas convertible, on retoune la valeur initiale
        if(result.isNullOrEmpty()) return inputNumber.toString()
        return result
    }

    // Fonction de conversion par division (3 ou 5)
    fun convertNumberDivise(inputNumber: Int): String {
        var result = ""
        if(inputNumber % 3 ==0) result+="Foo"
        if(inputNumber %5 == 0) result+="Bar"
        return result
    }

    // Fonction de conversion par transformation (remplacement de 3, 5 et 7)
    fun convertNumberTransform(inputNumber: Int): String {

        // Selection des valeurs 3, 5 et 7
        val filtered = inputNumber.toString().filter { e->e=='3' || e=='5' || e=='7' }

        if (filtered.isNullOrEmpty()) return ""

        // Remplacement des valeurs 3, 5 et 7
        return filtered.replace("3", "Foo").replace("5", "Bar").replace("7", "Quix")
    }
}
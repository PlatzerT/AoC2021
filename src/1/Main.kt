package `1`

import java.lang.NumberFormatException

/****************************
Name: Thomas Platzer
Erstelldatum: 02.12.21
Erstellzeit: 15:39
Projekt: AoC2021
 ****************************/

fun main(args: Array<String>) {
    println("ok")
    var input = Reader.readFileAsLines("/Users/thomasplatzer/Local/AoC2021/src/1/input.txt")
    println(input)

    var counter = 0

    for (i in 1 until input.size) {
        try {
            val parsedNumberBefore = input[i-1].toInt()
            val parsedNumberCurrent = input[i].toInt()

            if (parsedNumberCurrent > parsedNumberBefore) {
                counter++
            }
        } catch (nfe: NumberFormatException) {
            println("Not a valid integer")
        }
    }
    println(counter)
}


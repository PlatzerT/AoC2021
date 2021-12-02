import java.io.BufferedReader
import java.io.File
import java.lang.NumberFormatException

/****************************
Name: Thomas Platzer
Erstelldatum: 02.12.21
Erstellzeit: 15:39
Projekt: AoC2021
 ****************************/

fun main(args: Array<String>) {
    println("ok")
    var input = readFileAsLines("/Users/thomasplatzer/Local/AoC2021/1/src/input.txt")
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

fun readFileAsLines(fileName: String): List<String>
        = File(fileName).bufferedReader().readLines()
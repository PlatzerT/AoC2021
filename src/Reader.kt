import java.io.File

/****************************
Name: Thomas Platzer
Erstelldatum: 02.12.21
Erstellzeit: 16:06
Projekt: AoC2021
 ****************************/

class Reader {
    companion object {
        fun readFileAsLines(fileName: String): List<String>
                = File(fileName).bufferedReader().readLines()
    }
}
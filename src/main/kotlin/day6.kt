

import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */

    val num = readLine()
    val string1 = readLine()
    val string2 = readLine()

    if (string1 != null) {
        printOdsAndEvens(string1)
    }

    if (string2 != null) {
        printOdsAndEvens(string2)
    }
}

fun printOdsAndEvens(text: String){

    val length: Int? = text?.length

    var char = 0
    var evens: String = ""
    var odds: String = ""

    var evens2: String = ""
    var odds2: String = ""

    while (char < length!!) {
        if (char % 2 !=0) evens = "$evens${text[char].toString()}" else odds = "$odds${text[char].toString()}"
        char++
    }

    println("$odds $evens")

}
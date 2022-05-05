package `null-safety`

import kotlin.random.Random

fun getRandomResult(): String? {
    val randomInt = Random.nextInt(1, 100)
    if (randomInt <= 50) {
        return "It is a String"
    }
    return null
}

fun main() {
    var myString: String? = getRandomResult()
    println(myString)
    var upperCase = myString?.uppercase()
    println(upperCase)

    myString = "Test"
    println(myString)
    upperCase = myString.uppercase()
    println(upperCase)
}
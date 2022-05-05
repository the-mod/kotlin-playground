package `null-safety`

fun main() {
    var myString: String? = getRandomResult()
    println(myString)
    var upperCase = myString!!.uppercase()
    println(upperCase)
}
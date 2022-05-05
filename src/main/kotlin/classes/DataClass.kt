package classes

data class User(val name: String, val age: Int);

fun main() {
    val user1 = User(name="the-mod", age=36)
    println(user1)
}


package classes

class Plain2(radius: Double) {

    var radius = 0.0
        // setter
        set(value) {
            if (value <= 0) {
                throw IllegalArgumentException("Must be greater than 0")
            }
            field = value
        }

    // constructor
    init {
        this.radius = radius
    }
}

fun main() {
    val plain2 = Plain2(2.0)
    println(plain2.radius)

    Plain2(-2.0)
}
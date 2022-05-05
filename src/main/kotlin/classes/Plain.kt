package classes;

public class Plain(val name: String) {

  fun printClass() {
    println(name)
  }
}

fun main() {
  val instance = Plain("the-mod")
  instance.printClass()
}



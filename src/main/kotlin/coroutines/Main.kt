package coroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun showSlowMails() {
    val emails = retrieveMails()
    emails.forEach() {
        delay(1000)
        println("slow-" + it)
    }
}

suspend fun showMails() {
    val emails = retrieveMails()

    runBlocking<Unit> {
        val deferreds =  emails.map() {
            async {
                delay(1000)
                println("fast-" + it)
            }
        }
        deferreds.forEach {
            it.await()
        }
    }
}

suspend fun retrieveMails(): List<String> {
    delay(1000)
    return mutableListOf("one", "two", "three", "four")
}

fun main(args: Array<String>) {
    val time = measureTimeMillis {
        runBlocking {
            val one = launch { showMails() }
        }
    }
    println("Fast Completed in $time ms")


    val timeTwo = measureTimeMillis {
        runBlocking {
            showSlowMails()
        }
    }
    println("Slow Completed in $timeTwo ms")
}
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
    println("Completed in $time ms")


    val start = System.currentTimeMillis()
    println("Start: " + start)
    runBlocking {
        showSlowMails()
    }
    val stop = System.currentTimeMillis()
    println("Stop: " + stop)
    println("Toke " + (stop - start) + "ms")
}
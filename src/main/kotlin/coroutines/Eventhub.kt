package transformer.kotlin

import kotlinx.coroutines.delay

class Eventhub {

    suspend fun send(message: String, timeout: Long): String {
        delay(timeout)
        return message
    }
}

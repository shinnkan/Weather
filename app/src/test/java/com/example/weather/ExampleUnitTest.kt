package com.example.weather

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    fun solution(message: String, K: Int): String? {
        if (message.length <= K) {
            return message
        } else {
            var count = 0
            for (str in message){
                if (!str.equals(" ")){
                    count++;
                }
            }
        }
        return ""
    }
}
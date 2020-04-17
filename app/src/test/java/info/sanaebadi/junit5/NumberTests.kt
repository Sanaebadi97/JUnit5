package info.sanaebadi.junit5

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumberTests {

    @Test
    fun allIntegersAreEvenWhenMultipliedBy2() {
        for (i in 0..1000) {
            val doubleValue = i * 2

            Assertions.assertTrue(doubleValue % 2 == 0)
            println("double are $doubleValue")
        }
    }
}
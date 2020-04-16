package info.sanaebadi.junit5

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Assertions.assertSame
import org.junit.jupiter.api.Test

class AssertionExample {
    @Test
    fun exampleAssertion() {
        val string1 = "Hello World12"
        val string2 = "Hello World"

        assertNotEquals(string1, string2)
        println("is not same")
    }
}
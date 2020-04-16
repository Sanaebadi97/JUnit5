package info.sanaebadi.junit5

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*
import org.junit.jupiter.api.Assertions.assertAll as assertAll

class AssertionExample {
    @Test
    fun exampleAssertion() {
        val string1 = "Hello World12"
        val string2 = "Hello World"

        assertNotEquals(string1, string2, "Message if assertion fails")
        //  println("is not same")
    }


    @Test
    fun exampleBooleanAssertions() {
        val myRank = 5
        val total = 100
        Assertions.assertTrue(myRank > total)
        // println("is false")
    }

    @Test
    fun exampleNullAndNotNull() {
        val string1 = "1234"
        val string2 = "One"
        val string3 = "Hello World"

        Assertions.assertNotNull(string1.toIntOrNull())
        Assertions.assertNull(string2.toIntOrNull())
        Assertions.assertNull(string3.toIntOrNull())

        println("")
    }


//    @Test
//    fun multipleAssertion() {
//        assertAll(
//            "Multiple checks",
//            assertEquals("Hello world", "Hello " + "world"),
//            assertTrue(2 + 2 == 4)
//        )
//
//    }

}
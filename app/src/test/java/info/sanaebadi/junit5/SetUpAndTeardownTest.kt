package info.sanaebadi.junit5

import org.junit.Test
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll

class SetUpAndTeardownTest {

    @BeforeAll
    fun beforeAll() {
        println("Running before the first test")
    }

    @AfterAll
    fun afterAll() {
        println("Running after the last test")
    }


    @Test
    fun test1() {
        println("Running Test 1")
    }

    @Test
    fun test2() {
        println("Running Test 2")
    }

    @Test
    fun test3() {
        println("Running Test 3")
    }



}
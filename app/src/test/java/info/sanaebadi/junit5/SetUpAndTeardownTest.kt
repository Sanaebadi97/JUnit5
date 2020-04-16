package info.sanaebadi.junit5

import org.junit.Before
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

class SetUpAndTeardownTest {


    @BeforeEach
    fun beforeEach() {
        println("Called before each test method in this class")
    }

    @AfterEach
    fun afterEach() {
        println("Called after each test method in this class")
    }
}
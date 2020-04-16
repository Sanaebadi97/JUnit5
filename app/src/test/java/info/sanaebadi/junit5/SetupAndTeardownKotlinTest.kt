package info.sanaebadi.junit5

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SetupAndTeardownKotlinTest {

    companion object {
        @JvmStatic
        @BeforeAll
        fun beforeAll() {
            println("callback before the first test is executed")
        }

        @JvmStatic
        @AfterAll
        fun afterAll() {
            println("callback after all tests have seen executed")
        }

        @Test
        fun test1() {
            print("Running Test 1")
        }

        @Test
        fun test2() {
            print("Running Test 2")
        }

        @Test
        fun test3() {
            print("Running Test 3")
        }

    }

}
package info.sanaebadi.junit5

import org.junit.jupiter.api.Test

class NewInstancePerMethodTests {

    @Test
    fun test1() {
        println("Running Test 1 , this $this")
    }


    @Test
    fun test2() {
        println("Running Test 2 , this $this")
    }


    @Test
    fun test3() {
        println("Running Test 3 , this $this")
    }


}
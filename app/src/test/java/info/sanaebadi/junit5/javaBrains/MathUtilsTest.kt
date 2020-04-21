package info.sanaebadi.junit5.javaBrains

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*



@TestInstance(TestInstance.Lifecycle.PER_METHOD)
internal class MathUtilsTest {


    lateinit var mathUtils: MathUtils

    @BeforeEach
    fun init() {
        mathUtils = MathUtils()
    }


    companion object {

        @BeforeAll
        @JvmStatic
        fun beforeAllInit() {
            println("this needs to run before all")
        }


        @AfterAll
        @JvmStatic
        fun afterAllInit() {
            println("this needs to run after all")
        }



    }


    @AfterEach
    fun cleanup() {
        println("Cleaning up ...")
    }

    @Test
    internal fun addEquals() {
        assertEquals(6, mathUtils.add(2, 4))
    }

    @Test
    internal fun addNotEquals() {
        assertNotEquals(8, mathUtils.add(5, 9))
    }


    @Test
    fun divide() {
        assertThrows(
            ArithmeticException::class.java, {
                mathUtils.divide(1, 0)
            },
            "divide by zero should throw"
        )
    }


    @Test
    internal fun computeCircleArea() {
        assertEquals(12.566370614359172, mathUtils.computeCircleArea(2.0))
    }


}
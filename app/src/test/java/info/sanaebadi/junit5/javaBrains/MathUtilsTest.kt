package info.sanaebadi.junit5.javaBrains

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.condition.EnabledOnOs
import org.junit.jupiter.api.condition.OS
import org.junit.jupiter.api.function.Executable


@TestInstance(TestInstance.Lifecycle.PER_METHOD)
internal class MathUtilsTest {


    lateinit var mathUtils: MathUtils

    @BeforeEach
    fun init() {
        mathUtils = MathUtils()
    }


    @Tag("Math")
    @Nested
    inner class AddTest {


        @Test
        @DisplayName("Testing positive add method")
        fun testAddPositive() {
            assertEquals(2, mathUtils.add(1, 1), "The add method should add two numbers")
        }


        @Test
        @DisplayName("Testing negative add method")
        fun testAddNegative() {
            assertEquals(-2, mathUtils.add(-1, -1), "The add method should add two numbers")
        }


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
    @DisplayName("Testing add method ")
    internal fun addEquals() {
        assertEquals(6, mathUtils.add(2, 4))
    }

    @Test
    internal fun addNotEquals() {
        assertNotEquals(8, mathUtils.add(5, 9))
    }


    @Tag("Math")
    @Test
    @DisplayName("multiply method")
    fun testMultiply() {
        //assertEquals(4,mathUtils.add(2,2),"should return the right product")

        assertAll(
            Executable {
                assertEquals(
                    4,
                    mathUtils.multiply(2, 2)
                )
            },
            Executable {
                assertEquals(
                    0,
                    mathUtils.multiply(2, 0)
                )
            },
            Executable {
                assertEquals(
                    -2,
                    mathUtils.multiply(2, -1)
                )
            }
        )
    }


    @Tag("Math")
    @Test
    @EnabledOnOs(OS.LINUX)
    fun divide() {

        val isServerUp = false

//        assumeTrue(isServerUp)
        assertThrows(
            ArithmeticException::class.java, {
                mathUtils.divide(1, 0)
            },
            "divide by zero should throw"
        )
    }



    @Tag("Circle")
    @Test
    @RepeatedTest(3)
    internal fun computeCircleArea(repetitionInfo: RepetitionInfo) {
//        val currernt = repetitionInfo.currentRepetition
//        val total = repetitionInfo.totalRepetitions
        assertEquals(12.566370614359172, mathUtils.computeCircleArea(2.0))

//        println("Currenet $currernt Total $total")
    }

    @Tag("Math")
    @Test
    @Disabled
    @DisplayName("TDD method.Should not run")
    fun testDisabled() {
        fail<String>("This test should be disabled")
    }
}
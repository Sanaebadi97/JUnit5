package info.sanaebadi.junit5.javaBrains

import org.junit.Assert
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.lang.ArithmeticException

internal class MathUtilsTest {

    @Test
    internal fun addEquals() {
        assertEquals(6, MathUtils.add(2, 4))
    }

    @Test
    internal fun addNotEquals() {
        assertNotEquals(8, MathUtils.add(5, 9))
    }




    @Test
    fun divide() {
        assertThrows(
            ArithmeticException::class.java, {
                MathUtils.divide(1, 0)
            },
            "divide by zero should throw"
        )
    }


    @Test
    internal fun computeCircleArea() {
        assertEquals(12.566370614359172, MathUtils.computeCircleArea(2.0))
    }


}
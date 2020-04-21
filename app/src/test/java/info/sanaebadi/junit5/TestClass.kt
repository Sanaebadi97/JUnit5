package info.sanaebadi.junit5

import info.sanaebadi.junit5.javaBrains.MathUtils
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable

class TestClass {
    @Test
    @DisplayName("multiply method")
    fun testMultiply() {
        val mathUtils =
            MathUtils()
        Assertions.assertAll(
            Executable {
                Assertions.assertEquals(
                    4,
                    mathUtils.multiply(2, 2)
                )
            },
            Executable {
                Assertions.assertEquals(
                    0,
                    mathUtils.multiply(2, 0)
                )
            },
            Executable {
                Assertions.assertEquals(
                    -2,
                    mathUtils.multiply(2, -1)
                )
            }
        )
    }
}
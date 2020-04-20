package info.sanaebadi.junit5.javaBrains

import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*

internal class MathUtilsTest {

    @Test
    internal fun addEquals() {
        assertEquals(6, MathUtils.add(2, 4))
    }

    @Test
    internal fun addNotEquals() {
        assertNotEquals(8, MathUtils.add(5, 9))
    }


}
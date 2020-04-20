package info.sanaebadi.junit5.javaBrains

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals

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
    internal fun computeCircleArea() {
        assertEquals(12.566370614359172, MathUtils.computeCircleArea(2.0))
    }


}
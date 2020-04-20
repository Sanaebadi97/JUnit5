package info.sanaebadi.junit5.javaBrains

class MathUtils {


    companion object {
        fun add(a: Int, b: Int): Int {
            return a + b
        }


        fun subtract(a: Int, b: Int): Int {
            return a - b
        }

        fun computeCircleArea(radius: Double): Double {
            var area = Math.PI * radius * radius
            return area
        }
    }
}
package utils

import kotlin.math.pow

object CalculateAreaUtils {
    fun calculateAreaRectangle(length:Int, width:Int): Int {
        return length.times(width)
    }

    fun calculateAreaCircle(radius:Int): Double {
        return 3.14.times(radius.toDouble().pow(2))
    }

    fun calculateAreaTriangle(base:Int,height:Int): Double {
        return 0.5.times(base.times(height))
    }
}
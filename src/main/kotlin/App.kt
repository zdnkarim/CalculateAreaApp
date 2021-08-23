import shape.Circle
import shape.Rectangle
import shape.Shape
import shape.Triangle
import sun.security.util.Length
import utils.CalculateAreaUtils
import utils.StarGeneratorUtils

class App {
    private var StarGeneratorUtils = utils.StarGeneratorUtils()

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().start()
        }
    }

    fun start() {
        printHeader()
        readLine()?.let {
            openMenu(it)
        }
    }

    private fun printHeader(): Unit {
        println(
            """
            ======================================
            Console app for Calculating Area in 2D
            ======================================
            1. Calculate Rectangle Area
            2. Calculate Circle Area
            3. Calculate Triangle Area
            4. Print Star
            ======================================
            Enter menu ? (1/2/3/4)
            ======================================
        """.trimIndent()
        )

    }

    fun openMenu(menu: String): Unit {

        when (menu) {
            "1" -> {

                openMenuRectangle()
            }
            "2" -> {

                openMenuCircle()
            }
            "3" -> {

                openMenuTriangle()
            }
            "4" -> {

                openMenuPrintStar()
            }
            else -> {
                println("no menu matches")
                start()

            }
        }
    }

    private fun openMenuRectangle() {
        print("Input Length : ")
        val length = readLine()?.toInt() ?: 0
        print("Input Width : ")
        val width = readLine()?.toInt() ?: 0
        printShape(Rectangle(length, width))
    }

    private fun openMenuCircle() {
        print("Input Radius : ")
        val radius = readLine()?.toInt() ?: 0
        printShape(Circle(radius))
    }

    private fun openMenuTriangle() {
        print("Input Base : ")
        val base = readLine()?.toInt() ?: 0
        print("Input Heigt : ")
        val height = readLine()?.toInt() ?: 0
        print("Input Hypotenusa : ")
        val hypotenusa = readLine()?.toInt() ?: 0
        printShape(Triangle(height, base, hypotenusa))
    }

    private fun openMenuPrintStar() {
        print("Input Total Star (max:20) : ")
        val s = readLine()?.toInt() ?: 0
        StarGeneratorUtils.printStars(s)
    }

    private fun printShape(shape: Shape) {
        shape.printShapeName()
        shape.calculateAreaAndCircular()
    }
}
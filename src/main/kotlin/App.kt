import utils.CalculateAreaUtils

class App {
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
            ======================================
            Enter menu ? (1/2/3)
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
            else -> {
                println("no menu matches")
                start()

            }
        }
    }

    private fun openMenuRectangle() {
        print("Input Length : ")
        val l = readLine()?.toInt() ?: 0
        print("Input Width : ")
        val w = readLine()?.toInt() ?: 0
        print("Area of rectangle is ${CalculateAreaUtils.calculateAreaRectangle(l, w)}")
    }

    private fun openMenuCircle() {
        print("Input Radius : ")
        val r = readLine()?.toInt() ?: 0
        print("Area of circle is ${CalculateAreaUtils.calculateAreaCircle(r)}")
    }

    private fun openMenuTriangle() {
        print("Input Base : ")
        val b = readLine()?.toInt() ?: 0
        print("Input Heigt : ")
        val h = readLine()?.toInt() ?: 0
        print("Area of triangle is ${CalculateAreaUtils.calculateAreaRectangle(b, h)}")
    }
}
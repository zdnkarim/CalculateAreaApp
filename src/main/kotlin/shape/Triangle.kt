package shape

class Triangle(val height:Int,val base:Int, val hypotenusa:Int): Shape() {
    init {
        shapeName = "Triangle"
    }
    override fun calculateArea(): Double {
        return (base*height).toDouble()
    }

    override fun calculateCircular(): Double {
        return (height+base+hypotenusa).toDouble()
    }
}
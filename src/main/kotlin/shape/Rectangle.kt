package shape

class Rectangle(val length: Int, val width:Int):Shape(){
    init {
        shapeName = "Rectangle"
    }
    override fun calculateArea(): Double {
        return (length*width).toDouble()
    }

    override fun calculateCircular(): Double {
        return (length*2 + width*2).toDouble()
    }

}
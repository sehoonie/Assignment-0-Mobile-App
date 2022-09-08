class Square(_name: String): Shape(_name) {

    var length = 0.0
    var height = 0.0

    fun setDimensions(l: Double, h: Double) {
        length = l
        height = h
    }

    override fun printDimensions() {
        println("Length: $length")
        println("Height: $height")
    }

    override fun getArea(): Double {
        return length * height
    }
}
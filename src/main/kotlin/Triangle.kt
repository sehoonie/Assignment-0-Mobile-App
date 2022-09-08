import kotlin.math.sqrt

open class Triangle(_name: String): Shape(_name){

    var sideA = 0.0
    var sideB = 0.0
    var sideC = 0.0

    fun setDimensions(a: Double, b: Double, c: Double){
        sideA = a
        sideB = b
        sideC = c
    }

    override fun printDimensions() {
        println("Side A: $sideA")
        println("Side B: $sideB")
        println("Side C: $sideC")
    }

    override fun getArea(): Double {
        val s = (sideA + sideB + sideC)/2
        return sqrt((s*(s-sideA)*(s-sideB)*(s-sideC)))
    }

}
import kotlin.math.PI
import kotlin.math.pow

class Circle(_name: String): Shape(_name) {

    var radius = 0.0

    fun setDimensions(r: Double){
        radius = r
    }

    override fun printDimensions() {
        println("Radius: $radius")
    }

    override fun getArea(): Double {
        return PI * radius.pow(2)
    }
}
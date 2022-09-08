import kotlin.math.pow
import kotlin.math.sqrt

class EquilateralTriangle(_name:String): Triangle(_name) {

    var side = 0.0

    fun setDimensions(s: Double){
        side = s
    }

    override fun printDimensions(){
        println("Side: $side")
    }

    override fun getArea(): Double {
        return (sqrt(3.0)/4)*side.pow(2)
    }

}
import java.util.Scanner

fun main(){
//    Instantiating class objects / scanner object
    val reader = Scanner(System.`in`)
    val square = Square("Square")
    val circle = Circle("Circle")
    val triangle = Triangle("Triangle")
    val eqTriangle = EquilateralTriangle("Equilateral Triangle")

//    Asking for Square dimensions
    print("Please enter in the length of your Square: ")
    square.length = reader.nextDouble()
    print("Please enter in the height of your Square: ")
    square.height = reader.nextDouble()
    square.setDimensions(square.length,square.height)

//    Asking for circle dimensions
    print("Please enter in the radius of your Circle: ")
    circle.radius = reader.nextDouble()
    circle.setDimensions(circle.radius)

//    Asking for triangle dimensions
    print("Please enter in the first side of your Triangle: ")
    triangle.sideA = reader.nextDouble()
    print("Please enter in the second side of your Triangle: ")
    triangle.sideB = reader.nextDouble()
    print("Please enter in the third side of your Triangle: ")
    triangle.sideC = reader.nextDouble()
    triangle.setDimensions(triangle.sideA,triangle.sideB,triangle.sideC)


//    Asking for Equilateral Triangle dimensions
    print("Please enter in the side of your Equilateral Triangle: ")
    eqTriangle.side = reader.nextDouble()
    eqTriangle.setDimensions(eqTriangle.side)

//    Printing out Square information
    println("${square.name} dimensions are")
    square.printDimensions()
    println("and the area is ${square.getArea()}")

//    Printing out Circle information
    println(circle.name + " dimensions are")
    circle.printDimensions()
    println("and the area is " + circle.getArea())

//    Printing out Triangle information
    println(triangle.name + " dimensions are")
    triangle.printDimensions()
    println("and the area is " + triangle.getArea())

//    Printing out Equilateral Triangle information
    println(eqTriangle.name + " dimensions are")
    eqTriangle.printDimensions()
    println("and the area is " + eqTriangle.getArea())
}
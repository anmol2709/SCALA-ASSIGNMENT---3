class HigherOrderFunctions{
  //Using a higher order function for sum taking input as a function and 2 integers
  def sum(f: (Int, Int) => Int,a: Int, b:Int):Int = {
    f(a,b)
  }
  //Defining function literals
  val sumOfSquares=(a:Int , b:Int) =>(a*a)+(b*b)
  val sumOfCubes=(a:Int , b:Int) =>(a*a*a)+(b*b*b)
  val sumOfInts=(a:Int , b:Int) =>(a+b)
}
object HigherOrderFunctionsTester {
  def main(args: Array[String]) {
    val hf = new HigherOrderFunctions()
    val o1 = hf.sum( hf.sumOfSquares,3,4)
    val o2 = hf.sum(hf.sumOfCubes,3,4)
    val o3 = hf.sum(hf.sumOfInts,3,4)
    println("Sum of Squares = " + o1)
    println("Sum of Cubes = " + o2)
    println("Sum of Ints = " + o3)
  }
}

import com.knoldus.queueHelper._             //Importing packages
import com.knoldus.queueImplementer._
object TraitObject {
  def main(args: Array[String]) {
    val d = new DoubleQueue()
    val s = new SquareQueue()
    var l = List[Int]()
    l=d.doubleElements(l,5)     //Doubling the element and adding to queue
    l=s.squareElements(l,4)     //Squaring the element and adding to queue
    println("List is : " + l)

    l= d.removeDouble(l) //removing an element from the queue
    println("List is :" +l)

    l = s.removeSquare(l) //removing an element from the queue
    println("List is :" + l)

  }
}

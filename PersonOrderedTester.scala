
object PersonOrderedTester {
  def main(args: Array[String]) {
    val personOne = new Person("ABC",34)
    val personTwo = new Person("ABC",23)
    val personThree = new Person("XYZV",23)
    println(personOne.compare(personTwo))     //Returns the difference between the ages as the names are Same
    println(personTwo.compare(personThree))   //Returns the difference between the length of names
  }
}

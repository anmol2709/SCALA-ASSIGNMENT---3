/*Define three Value classes namely: FirstName, LastName and Age
Define a method like - displayDetails which may take these three value classes as inputs and returns a string as:
Output: Prashant Goel is of 24 years.*/

class FirstName(val fName:String) extends AnyVal
class LastName(val lName:String) extends AnyVal
class Age(val age:Int) extends AnyVal
class ValueClass()
{
  def displayDetails(firstName:FirstName,lastName:LastName,age:Age):String={
    s"${firstName.fName} ${lastName.lName} is of ${age.age} years."
  }
}
object ValueClassTester {
  def main(args: Array[String]) {
    val firstName = new FirstName("Prashant")
    val lastName = new LastName("Goel")
    val age = new Age(24)
    val valueClassObj = new ValueClass()
    val s = valueClassObj.displayDetails(firstName,lastName,age)
    println(s)
  }
}

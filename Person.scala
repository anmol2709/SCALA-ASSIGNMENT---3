/*Define a class named Person and mix it with Ordered Trait to do the comparison.
First check if the name parameter of both object is equal. If yes, then do the comparison according to age.
If name is not equal then do the comparison based on name length.*/

class Person (val name:String,val age:Int) extends Ordered[Person]{

  def compare(that:Person)={
    if(this.name.equals(that.name))
      {
        this.age-that.age
      }
    else
      {
        this.name.length-that.name.length
      }
  }
}

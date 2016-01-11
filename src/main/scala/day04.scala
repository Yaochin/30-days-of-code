class Person {

  var age: Int = 0

  def this(initial_Age:Int) = {
    this()
    if ( initial_Age < 0 ) {
      println("This person is not valid, setting age to 0.")
      age = 0
    } else {
      age = initial_Age
    }
  }

  def amIOld(): Unit = {
    if ( age < 13 ) {
      println("You are young.")
    } else if ( age >= 13 && age < 18 ) {
      println("You are a teenager.")
    } else {
      println("You are old.")
    }
  }

  def yearPasses(): Unit = {
    age = age + 1
  }

}

object Day04 {

  def main(args: Array[String]) {
    val T = scala.io.StdIn.readInt()
    val i = 0
    for(i <- 1 to T){
      val age= scala.io.StdIn.readInt()
      val p= new Person(age)
      p.amIOld()
      var j=0
      for(j<-1 to 3){
        p.yearPasses()
      }
      p.amIOld()
      System.out.println()
    }
  }
}

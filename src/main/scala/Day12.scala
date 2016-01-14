import java.util.Scanner


object Day12 {
  def main(args: Array[String]) {
    val sc = new Scanner(System.in)
    val firstName = sc.nextLine()
    val lastName = sc.nextLine()
    val phone = sc.nextInt()
    val score = sc.nextInt()
    val stu: Student = new Grade(firstName,lastName,phone,score)
    stu.display()

    println("Grade: "+stu.asInstanceOf[Grade].calculate)

  }
}

class Student(fname: String, lname: String, p: Int) {
  def display(){
    println("First Name: "+fname+"\nLast Name: "+lname+"\nPhone: "+p)
  }
}

class Grade(fname: String, lname: String, phone: Int, score: Int) extends Student(fname, lname, phone) {
  def calculate: Char = {
    if ( score < 40 ) 'D'
    else if (score >= 40 && score < 60) 'B'
    else if (score >=60 && score < 75) 'A'
    else if (score >=75 && score < 90) 'E'
    else 'O'
  }

}

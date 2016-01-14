import java.util.Scanner

object Day13 {

  def main(args: Array[String]){
    val sc= new Scanner(System.in)
    val title=sc.nextLine()
    val author=sc.nextLine()
    val price = sc.nextInt()
    val new_novel= new MyBook(title,author,price)
    new_novel.display()
  }
}

abstract class Book(title: String, author: String) {
  def display()
}

class MyBook(t: String, a:String, p: Int) extends Book(t, a) {
  override def display() = {
    println("Title: " + t)
    println("Author: " + a)
    println("Price: " + p)
  }
}

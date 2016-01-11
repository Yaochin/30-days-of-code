import scala.io.StdIn

object Day08 {

  def main(args: Array[String]): Unit = {

    val n = StdIn.readLine().toInt
    var phoneBook = Map[String, String]()
    for (i <- 1 to n) {
      val name = StdIn.readLine()
      val number = StdIn.readLine()
      phoneBook = phoneBook + (name -> number)
    }

    Iterator.continually(StdIn.readLine())
      .takeWhile(line => line != null && line.nonEmpty)
      .foreach { input =>
        val number = phoneBook.get(input)
        number match {
          case Some(value) => println(s"$input=$value")
          case None => println("Not found")
        }
      }
  }

}

import scala.io.StdIn

object day02 {

  def main(args: Array[String]): Unit = {
    val m = StdIn.readLine().toDouble
    val t = StdIn.readLine().toDouble
    val x = StdIn.readLine().toDouble

    val total = (m + (m * t / 100) + (m * x / 100)).round

    println(s"The final price of the meal is $$$total.")
  }
}

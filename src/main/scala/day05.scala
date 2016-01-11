import scala.io.StdIn

object Day05 {
  def main(args: Array[String]) {
    val t = StdIn.readLine().toInt

    for ( i <- 1 to t ) {
      val inputs = StdIn.readLine().split(' ')
      val a = inputs(0).toInt
      val b = inputs(1).toInt
      val n = inputs(2).toInt

      var result = a
      for (j <- 0 until n) {
        result = result + scala.math.pow(2, j).toInt * b
        print(result + " ")
      }

      print("\n")
    }

  }

}

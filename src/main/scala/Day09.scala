import scala.annotation.tailrec

object Day09 {

  @tailrec
  def gcd(x: Int, y: Int): Int = {
    val (a, b) = if (x > y) (x, y) else (y, x)
    if ((a - b) == 0) {
      b
    } else {
      gcd(a - b, b)
    }
  }


  /** This part handles the input/output. Do not change or modify it **/
  def acceptInputAndComputeGCD(pair: List[Int]) = {
    println(gcd(pair.head, pair.reverse.head))
  }

  def main(args: Array[String]) {
    /** The part relates to the input/output. Do not change or modify it **/
    acceptInputAndComputeGCD(readLine().trim().split(" ").map(x => x.toInt).toList)

  }
}

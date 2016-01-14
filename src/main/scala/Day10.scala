import scala.io.StdIn

object Day10 {

  def main(args: Array[String]) {
    val n = StdIn.readLine().toInt

    for (i <- 0 until n) {
      val v = StdIn.readLine().toInt

      val maxIndex = getMaxIndex(v)

      printOneBit(v, maxIndex)

    }

  }

  def printOneBit(v: Int, index: Int): Unit = {

    val bitValue = Math.pow(2, index).toInt
    val remaining = if ( bitValue <= v ) {
      print("1")
      v - bitValue
    } else {
      print("0")
      v
    }

    if ( index == 0 ) {
      println()
    } else {
      printOneBit(remaining, index - 1 )
    }

  }

  def getMaxIndex(v: Int): Int = {
    var i = 0
    while ( Math.pow(2, i) <= v ) {
      i = i+1
    }

    if ( i == 0 ) 0
    else i - 1
  }

  // ex: 7 = 2^2*1 + 2^1*1 + 2^0*1
  // ex: 13 = 2^3*1 + 2^2*1 + 2^1*0 + 2^0*1


}

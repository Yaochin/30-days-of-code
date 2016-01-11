import scala.io.StdIn

object Day10 {

  def main(args: Array[String]) {
    val n = StdIn.readLine().toInt

    for (i <- 0 until n) {
      val v = StdIn.readLine().toInt

      val maxIndex = getMaxIndex(v)

//      println(s"max. index: $maxIndex")

      var remaining = v

      for (j <- 0 to maxIndex) {
        val index = maxIndex - j
        val r = get1or0(remaining, index)

        print(r)

        if ( r == 1 ) {
          val valueOf2 = Math.pow(2, index).toInt
          remaining = remaining - valueOf2
        }


      }
      println()

    }


  }

  def getMaxIndex(v: Int): Int = {
    var i = 0
    while ( Math.pow(2, i) <= v ) {
      i = i+1
    }
    i - 1
  }

  def get1or0(v: Int, index: Int): Int = {
    if ( Math.pow(2, index) > v ) {
      0
    } else {
      1
    }
  }

  // ex: 7 = 2^2*1 + 2^1*1 + 2^0*1
  // ex: 13 = 2^3*1 + 2^2*1 + 2^1*0 + 2^0*1


}

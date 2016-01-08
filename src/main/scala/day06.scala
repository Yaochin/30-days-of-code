object day06 {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    for (i <- 1 to n) {
      var line = List[Char]()
      for ( j <- 1 to (n-i) ) {

        line = line :+ ' '
      }

      for ( k <- 1 to i) {
        line = line :+ '#'
      }

      println(line.mkString(""))
    }
  }

}

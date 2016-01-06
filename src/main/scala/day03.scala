object day03 {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    val output = if (n % 2 != 0) {
      "Weird"
    } else if ( n > 20) {
      "Not Weird"
    } else if ( n >= 2 && n <= 5 ) {
      "Not Weird"
    } else {
      "Weird"
    }

    println(output)
  }
}


object Day11 {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val arr = Array.ofDim[Int](6,6)
    for(arr_i <- 0 to 6-1) {
      for(arr_j <- 0 to 6-1){
        arr(arr_i)(arr_j) = sc.nextInt()
      }
    }

    var maxSum = Int.MinValue

    for ( i <- 0 until 4 ) {
      for (j <- 0 until 4) {
        println(s"---($i,$j)-----")

        val array = copyArray((i, j), arr)

        printArray(array)

        val sum = getSum(array)

        println("sum: "+sum)
        if (sum >= maxSum) maxSum = sum
      }
    }

    println(maxSum)
  }

  def printArray(arry:  Array[Array[Int]]): Unit = {
    for ( i <- 0 until 3) {
      for (j <- 0 until 3) {
        print(arry(i)(j) + " ")
      }

      println()
    }
  }

  def copyArray(startPosition: (Int, Int), srcArry: Array[Array[Int]]): Array[Array[Int]] = {
    val result = Array.ofDim[Int](3,3)

    val (x, y) = startPosition

    for(i <- 0 until 3) {
      val a = Array.ofDim[Int](3)
      System.arraycopy(srcArry(y+i), x, a, 0 , 3)
      result(i) = a
    }

    result
  }

  def getSum(array: Array[Array[Int]]): Int = {
    array(0)(0) + array(0)(1) + array(0)(2) + array(1)(1) + array(2)(0) + array(2)(1) + array(2)(2)
  }
}

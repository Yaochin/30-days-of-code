object Day01 {
  def main(args: Array[String]) {
    printlnDataType(5.35)
    printlnDataType('a')
    printlnDataType(false)
    printlnDataType(100)
    printlnDataType("I am a code monkey")
    printlnDataType(true)
    printlnDataType(17.3)
    printlnDataType('c')
    printlnDataType("derp")
  }

  def printlnDataType(input: Any): Unit = {
    input match {
      case i: Int => println("Primitive : int")
      case b: Boolean => println("Primitive : boolean")
      case d: Double => println("Primitive : double")
      case c: Char => println("Primitive : char")
      case s: String => println("Referenced : String")
    }
  }
}

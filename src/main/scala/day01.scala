object day01 {
  def main(args: Array[String]) {
    getDataType(5.35)
    getDataType('a')
    getDataType(false)
    getDataType(100)
    getDataType("I am a code monkey")
    getDataType(true)
    getDataType(17.3)
    getDataType('c')
    getDataType("derp")
  }

  def getDataType(input: Any): Unit = {
    input match {
      case i: Int => println("Primitive : int")
      case b: Boolean => println("Primitive : boolean")
      case d: Double => println("Primitive : double")
      case c: Char => println("Primitive : char")
      case s: String => println("Referenced : String")
    }
  }
}

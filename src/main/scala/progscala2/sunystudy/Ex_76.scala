package progscala2.sunystudy

object Ex_76 {
  def main(args: Array[String]): Unit = {
    val map = Map(
      "number1" -> "aa",
      "number2" -> "bb",
      "number3" -> 3,
      5 -> "cc"
    )

    println(map.isEmpty)
    println("whole mal : " + map)
    println("keys : " + map.keys)
    println("values : " + map.values)
    println(map("number1"))
  }
}

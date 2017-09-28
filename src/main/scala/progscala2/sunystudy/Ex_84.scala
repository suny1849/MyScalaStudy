package progscala2.sunystudy

object Ex_84 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 3, 5, 7)
    val n = o.partition(i => i < 4)
    println(n)
  }
}

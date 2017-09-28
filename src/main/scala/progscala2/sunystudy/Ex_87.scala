package progscala2.sunystudy

object Ex_87 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4, 5, 6, 7, 0)

    val n = o.drop(5)
    val nn = o.dropWhile(i => i < 4)

    println(n)
    println(nn)
  }
}

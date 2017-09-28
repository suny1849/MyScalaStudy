package progscala2.sunystudy

object Ex_83 {
  def main(args: Array[String]): Unit = {
    val o = List(2, 4, 6, 7)
    val n = o.foldRight(2)((i, j) => i + j)

    println(n)
  }
}

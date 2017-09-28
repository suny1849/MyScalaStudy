package progscala2.sunystudy

object Ex_86 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)

    val n = o.find(i => i > 2)
    val nn = o.find(i => i == 9)

    println(n)
    println(nn)
  }
}

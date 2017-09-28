package medium2lazysoul

object high_order_function {
  def main(args: Array[String]): Unit = {
    println(simpleHighOrderFunction((x, y) => x + y, 10, 20))
  }

  def simpleHighOrderFunction(sum: (Int, Int) => Int, a: Int, b: Int): Int = sum(a, b)
}

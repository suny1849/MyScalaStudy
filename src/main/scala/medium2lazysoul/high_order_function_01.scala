package medium2lazysoul

object high_order_function_01 {

  def main(args: Array[String]): Unit = {
    println(simpleHighOrderFunction((x, y) => x + y, 10, 20))

    println(simpleHighOrderFunction(sumInts, 10, 20))
    println(simpleHighOrderFunction(productInts, 10, 20))
    println(simpleHighOrderFunction(doubleSumeInts, 10, 20))

    println(simpleHighOrderFunction((x, y) => x + y, 10, 20))
    println(simpleHighOrderFunction((x, y) => x * y, 10, 20))
    println(simpleHighOrderFunction((x, y) => (x + y) * 2, 10, 20))
  }

  def simpleHighOrderFunction(sum: (Int, Int) => Int, a: Int, b: Int): Int = sum(a, b)

  def sumInts(a: Int, b: Int): Int = a + b

  def productInts(a: Int, b: Int): Int = a * b

  def doubleSumeInts(a: Int, b: Int): Int = (a + b) * 2

}

package medium2lazysoul

object callByName {
  def main(args: Array[String]): Unit = {
    callByName(funA)
  }

  def callByName(f : () => Boolean): Boolean = {
    println("callByName")
    f()
  }

  def funA(): Boolean = {
    println("funA")
    true
  }
}

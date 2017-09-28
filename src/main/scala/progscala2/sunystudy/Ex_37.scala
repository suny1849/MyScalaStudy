package progscala2.sunystudy

object Ex_37 {
  def main(args: Array[String]): Unit = {
    for(x <- 1 until 5 ; y <- 1 until 5)
      println(x + " * " + y + " = " + x * y + " | ")
  }
}

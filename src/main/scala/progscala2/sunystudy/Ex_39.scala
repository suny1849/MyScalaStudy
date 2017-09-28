package progscala2.sunystudy

object Ex_39 {
  def main(args: Array[String]): Unit = {
    for (i <- (1 to 20) if (i % 2 == 0)) {
      println(i + " | ")
    }
  }
}

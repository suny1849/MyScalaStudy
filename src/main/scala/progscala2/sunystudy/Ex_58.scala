package progscala2.sunystudy

object Ex_58 {
  def main(args: Array[String]): Unit = {
    printlnString("string-01", "string-02", "string-03")
  }

  def printlnString(args: String*) = {
    for (arg <- args) {
      println(arg)
    }
  }
}

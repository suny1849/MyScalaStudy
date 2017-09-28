package progscala2.sunystudy

object Ex_59 {

  def default(a: Int = 10, b:Int = 100): Int = a + b

  def main(args: Array[String]): Unit = {
    println("기본값은 " + default())
  }

}

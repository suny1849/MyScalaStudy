package progscala2.sunystudy

object Ex_96 {
  def main(args: Array[String]): Unit = {
    //println(Object1.ma)
    println(Object1.mb)
  }

  object Object1 {
    private def main = {}
    def mb = {}
  }

  object Object2 {
    //val a = Object1.ma
    val b = Object1.mb
  }

}

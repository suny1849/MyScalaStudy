package progscala2.sunystudy

object Ex_510 {
  def main(args: Array[String]): Unit = {
    val something = new SomeClass
    //println(something(2))
    println(something.apply(2))
    //println(something.method(2))
    //println(something.method2("이건 뭐지????"))
  }

  class SomeClass {
    def apply(n: Int) = method(n)
    def method(i: Int) = i + i
    def method2(s: String) = s
  }

}

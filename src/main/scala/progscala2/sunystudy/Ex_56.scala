package progscala2.sunystudy

object Ex_56 {

  def main(args: Array[String]): Unit = {
    val g = f
    //val g: (Int => Int) = f
    println(f(1))
  }

  //def f(i: Int) = i
  def f = (i: Int) => i

}

package progscala2.sunystudy

object Ex_57 {

  def calc(f: Int => Int, start: Int, end: Int) = {
    def loop(index: Int, sum: Int):Int = {
      if (index > end) sum
      else loop(index + 1, f(index) + sum)
    }

    loop(start, 0)
  }

  def main(args: Array[String]): Unit = {
    println("시작")
    val result = calc(x => x * 100, 2, 5)
    println(result)
  }
}

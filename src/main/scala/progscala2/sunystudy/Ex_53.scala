package progscala2.sunystudy

object Ex_53 {

  def main(args: Array[String]): Unit = {
    dropship(people(5))
  }

  def dropship(n: => Int) = {
    println("드랍십을 준비합니다.")
    println(n + "명 탑승했습니다.")
  }

  def people(n: Int) = {
    println("탑승 수속을 시작합니다.")
    n
  }
}

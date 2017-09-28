package progscala2.sunystudy

object Ex_94 {
  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readLine("값을 입력하세요 : ")
    val result: Either[String, Int] = try {
      Right(input.toInt)
    } catch {
      case e: Exception => Left(input)
    }
    println(result.getClass)
  }
}
package progscala2.sunystudy

import scala.io.StdIn.readLine
import java.io.File
import java.io.PrintWriter

object Ex_95 {
  def main(args: Array[String]): Unit = {
    val fileName = "Ex_95.txt"
    var input = readLine("파일에 쓸 내용을 입력하세요 : ")

    val writer = new PrintWriter(new File(fileName))
    writer.write(input)
    writer.close()

    println("입력하신 " + input + " 텍스트를 " + fileName + "에 저장했습니다.")
  }
}

package progscala2.sunystudy

object Ex_61 {

  def matchFunction(input: Any): Any = input match {
    case 100 => "hundred"
    case "hundred" => 100
    case etcNumber: Int => "입력값은 100이 아닌 Int형 정수 입니다."
    case _ => "기타"
 }

  def main(args: Array[String]): Unit = {
    println(matchFunction(100))
    println(matchFunction("hundred"))
    println(matchFunction(1000))
    println(matchFunction(1000.5))
    println(matchFunction("thousand"))
  }
}

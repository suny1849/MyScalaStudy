package progscala2.sunystudy

object Ex_63 {
  def main(args: Array[String]): Unit = {
    val number1 = "010-4787-8790"
    val number2 = "119"
    val number3 = "사과 쳐먹은 되재 새끼!!!"
    val numberList = List(number1, number2, number3)

    for (number <- numberList) {
      number match {
        case Emergency() => println("긴급전화")
        case Normal(number) => println("일반전화 - " + number)
        case _ => println("판단 못함!!!")
      }
    }
  }
}

object Emergency {
  def unapply(number: String): Boolean = {
    if (number.length == 3 && number.forall(_.isDigit)) true
    else false
  }
}

object Normal {
  def unapply(number: String): Option[Int] = {
    try {
      var o = number.replaceAll("-", "")
      Some(number.replaceAll("-", "").toInt)
    } catch {
      case _: Throwable => None
    }
  }
}

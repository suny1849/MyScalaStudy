package progscala2.sunystudy

object Ex_42 {
  def main(args: Array[String]): Unit = {
    val apple = new Fluit(600, "사과")
    println(apple.name)
    println(apple.price)
  }
}

case class Fluit(price: Int, name: String)
//class Fluit(price: Int, name: String)

/*
class Fluit(input1: Int, input2: String) {
  var name = input2
  var price = input1
}
*/

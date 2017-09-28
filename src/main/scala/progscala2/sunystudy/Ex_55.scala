package progscala2.sunystudy

object Ex_55 {

  def main(args: Array[String]): Unit = {
    val thisYear = 2017
    //val fixedValueFunction = go(thisYear, _: String)
    val fixedValueFunction = go(thisYear)_

    fixedValueFunction("테스트 하나")
    fixedValueFunction("테스트 둘")
    fixedValueFunction("테스트 셋")
  }

  //def go(thisYear: Int, string: String) = {
  def go(thisYear: Int)(string: String) = {
    println(string + " : " + thisYear)
  }
}

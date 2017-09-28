package progscala2.sunystudy

object Ex_91 {
  def main(args: Array[String]): Unit = {
    val list = List(10, 21, 34, 45)

    /*
    def foreach(list: List[Int]) = {
      def add(list: List[Int], total: Int): Int = {
        list match {
          case List() => total
          case List(item) => total + item
          case head :: tail => add(tail, total + head)
        }
      }

      add(list, 0)
    }

    println(foreach(list))
    */

    val result = list.foldLeft(0)((total, item) => total + item)
    println(result)
  }
}

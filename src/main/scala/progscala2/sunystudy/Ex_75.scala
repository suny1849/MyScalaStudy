package progscala2.sunystudy

object Ex_75 {
  def main(args: Array[String]): Unit = {
    val list3 = "a" :: "b" :: "c" :: Nil
    val list4 = 1 :: 2 :: 3 :: Nil
    val list5 = 2 :: 2 :: 4 :: Nil

    println(list3 ++ list4)
    println(list3.apply(2))
    println(list3.reverse)
    println(list4.max)
    println(list4.min)
    println(list4.sum)
    println(list4.mkString(","))
    println(list4.exists(a => a > 3))
    println(list4.contains(4))
    println(list4.isEmpty)
    println(list5.distinct)
  }

}

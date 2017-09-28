object StringUtil {
  def joiner(strings: String*): String = strings.mkString("-")
  def joiner(strings: List[String]): String = joiner(strings:_*)

  //def joiner(strings: List[String], separator: String): String = strings.mkString(separator)
  //def joiner(strings: List[String]): String = joiner(strings, "")
  //def joiner(strings: String*): String = joiner(strings.toList)
}
println(StringUtil.joiner(List("Programming", "Scala")))
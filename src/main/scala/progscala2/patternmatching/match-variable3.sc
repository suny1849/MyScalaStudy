for {
  x <- Seq(1, 2, 2.7, "one", "two", 'five)
} {
  val str = x match {
    case _: Int | _: Double =>"a number: "+x
    case "one"              => "string one"
    case _: String          => "other string: "+x
    case _                  => "unexpected value: "+x
  }
  println(str)
}
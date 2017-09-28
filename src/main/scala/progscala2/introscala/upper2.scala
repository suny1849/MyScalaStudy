package progscala2.introscala

object upper2 {
  def main(args: Array[String]) = {
    val output = args.map(_.toUpperCase()).mkString("[", ", ", "]")
    println(output)
  }
}

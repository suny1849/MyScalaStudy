package progscala2.introscala

object upper1 {
  def main(args: Array[String]) = {
    args.map(_.toUpperCase()).foreach(printf("%s ",_))
    println("")
  }
}

val bools = Seq(true, false)

for (bool <- bools) {
  bool match {
    case true => println("Go heads")
    case false => println("Got tails")
  }
}

for (bool <- bools) {
  val which = if (bool) "head" else "tails"
  println("Got "+ which)
}
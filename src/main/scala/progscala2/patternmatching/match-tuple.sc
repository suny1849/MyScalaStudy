val langs = Seq (
  ("Scala",   "Martin", "Ordersky"),
  ("Clojure", "Rich",   "Hickey"),
  ("Lisp",    "Join",   "McCarthy"))

for (tuple <- langs) {
  tuple match {
    case ("Scala", _, _) => println("Found Scala")
    case (lang, first, last) =>
      println(s"Found other language: $lang ($first, $last)")
  }
}
def makeList(strings: String*) = {
  if (strings.length == 0)
    List(0)
  else
    strings.toList
}

val list: List[String] = makeList()
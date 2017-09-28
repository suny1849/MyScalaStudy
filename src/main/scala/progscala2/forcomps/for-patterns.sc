// src/main/scala/progscala2/forcomps/for-patterns.sc

val ignoreRegex = """^\s*(#.*|\s*)$""".r
val kvRegex     = """^\s*([^=]+)\s*=\s*([^#]+)\s*.*$""".r

val propertis =
  """
    |# 도서 프로젝트
    |
    |book.name = Programming Scala, Second Edtion # 주석
    |book.author = Dean Wampler and Alex Payne
    |book.publisher = O'Reilly
    |book.publication-year = 2014
  """.stripMargin

val kvPairs = for {
  prop <- propertis.split("\n")
  if ignoreRegex.findFirstIn(prop) == None
  kvRegex(key, value) = prop
} yield (key.trim, value.trim)

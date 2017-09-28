def hello(name: String) =
  s"""xxxGoodbye, ${name}yyy
      xxxCome again! yyy""".stripPrefix("xxx").stripSuffix("yyy")


  /*
  s"""Welcome!
  Hello, $name!
  * (Gratuitous Star!)
  | We're glad you're here,
  | Have some extra whitespace.""".stripMargin
  */

hello("Programming Scala")
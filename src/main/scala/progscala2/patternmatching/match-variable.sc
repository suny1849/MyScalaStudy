// src/main/scala/progscala2/patternmatching/match-variable.sc

for {
  x <- Seq(1, 2, 2.7, "one", "two", 'four)                           // <1>
} {
  val str = x match {                                                // <2>
    /*
    case 1          => "int 1"                                       // <3>
    case i: Int     => "other int: "+i                               // <4>
    case d: Double  => "a double: "+x                                // <5>
    case "one"      => "string one"                                  // <6>
    case s: String  => "other string: "+s                            // <7>
    case unexpected => "unexpected value: " + unexpected             // <8>
    */

    /*
    case 1         => "int 1"
    case _: Int    => "other int: "+x
    case _: Double => "a double: "+x
    case "one"     => "string one"
    case _: String => "other string: "+x
    case _         => "unexpected value : "+x
    */

    case _: Int| _: Double => "a number: "+x
    case "one"             => "string one"
    case _: String         => "other string: "+x
    case _                 => "unexpected value: "+x
  }
  println(str)                                                       // <9>
}
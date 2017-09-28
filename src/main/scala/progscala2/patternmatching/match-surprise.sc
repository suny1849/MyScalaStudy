def checkY(y: Int) = {
  for {
    x <- Seq(99, 100, 101)
  } {
    val str = x match {
      case 'y' => "found y!"
      case i: Int => "Int: "+i
    }
    println(str)
  }
}
checkY(100)
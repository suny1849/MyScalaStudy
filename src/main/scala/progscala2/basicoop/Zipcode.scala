package progscala2.basicoop

case class Zipcode(zip: Int, extension: Option[Int] = None) {
  require(valid(zip, extension), s"Invalid Zip+4 specified: $toString")

  protected def valid(z: Int, e: Option[Int]):  Boolean = {
    if (0 < z && z <= 99999) e match {
      case None    => validUSPS(z, 0)
      case Some(e) => 0 < e && e <= 9999 && validUSPS(z, e)
    }
    else false
  }

  protected def validUSPS(i: Int, e: Int): Boolean = true

  override def toString: String =
    if (extension != None) s"$zip - ${extension.get}" else zip.toString
}

object Zipcode {
  def apply (zip: Int, extension: Int): Zipcode =
    new Zipcode(zip, Some(extension))
}

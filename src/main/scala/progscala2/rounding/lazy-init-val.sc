object ExpensiveResource {
  lazy val resource: Int = init()
  def init(): Int = {
    // do something expensive
    0
  }
}
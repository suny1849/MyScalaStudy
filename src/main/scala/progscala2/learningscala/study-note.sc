def max(a: Int, b: Int, c: Int) = {
  def max(x: Int, y: Int) = if (x > y) x else y
  max(a, max(b, c))
}
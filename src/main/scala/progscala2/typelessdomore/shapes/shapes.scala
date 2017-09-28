package progscala2.typelessdomore.shapes

// 기본 초기값을 지정한 Point를 정의
case class Point(x: Double = 0.0, y: Double = 0.0) {
  // 새로 정의한 Shift 메서드는 기존 Point로부터 x,y축의 위치를 더하거나 뺀 새 Point를 만든다.
  // shift는 케이스 클래스에 자동으로 생기는 copy 메서드를 활용한다.
  def shift(deltax: Double = 0.0, deltay: Double = 0.0) = {
    copy(x + deltax, y + deltay)
  }
}

abstract class Shape() {
  def draw(offset: Point = Point(0.0, 0.0))(f: String => Unit): Unit = {
    f(s"draw(offset = $offset), ${this.toString}")
  }
}

case class Circle(center: Point, radus: Double) extends Shape

case class Rectangle(lowerLeft: Point, height: Double, width: Double) extends Shape
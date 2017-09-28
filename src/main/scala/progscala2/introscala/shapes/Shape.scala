package progscala2.introscala.shapes

// 2차원 점을 표현하는 클래스 정의
case class Point(x: Double = 0.0, y: Double = 0.0)

// 기하학적 모양의 추상 클래스 정의
abstract class Shape() {
  // 모양을 렌터링 하는 draw 메서드를 구현, 여기서는 문자열만 출력
  // draw는 함수를 인자로 받느다. 그 함수는 그리기를 담당한다.
  // 각 Shape는 자신을 문자열로 바꾼 결과를 그 함수에 전달할 것이다.
  def draw(f: String => Unit): Unit = f(s"draw.${this.toString}")
}

/*
object Point {
  def apply(x: Double = 0.0, y: Double = 0.0): Point = new Point(x, y)
}
*/

// 중심과 반지름을 가지고 원 정의
case class Circle(center: Point, radus: Double) extends Shape

// 좌측 하나의 좌표, 너비, 높이로 직사각형 정의, 편의상 사각형의 네면이 x축이나 y축에 평행하다고 가정
case class Rectangle(lowerLeft: Point, height: Double, width: Double) extends Shape

// 3개의 점으로 삼각형 정의
case class Triangle(point1: Point, point2: Point, point3: Point) extends Shape

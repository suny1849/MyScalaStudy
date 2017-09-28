// src/main/scala/progscala2/patternmatching/match-vararglist.sc

// WHERE 절에서 사용할 연산자들
object Op extends Enumeration {                                      // <1>
type Op = Value

  val EQ   = Value("=")
  val NE   = Value("!=")
  val LTGT = Value("<>")
  val LT   = Value("<")
  val LE   = Value("<=")
  val GT   = Value(">")
  val GE   = Value(">=")
}
import Op._

// SQL의 'WHERE x op value'절을 표현한다.
// op는 =, !=, <>, <, <=, >, or >= 등의 비교 연산자다.
case class WhereOp[T](columnName: String, val1: T, value: T)

case class WhereIn[T](clumnName: String, val1: T, vals: T*)

val wheres = Seq(
  WhereIn("state", "IL", "CA", "VA"),
  WhereOp("state", "EQ", "IL"),
  WhereOp("name", EQ, "Buck Trends"),
  WhereOp("age", GT, 29))

for (where <- wheres) {
  where match {
    case WhereIn(col, val1, vals @ _*) =>
      val valStr = (val1 +: vals).mkString(", ")
      println(s"WHERE $col IN ($valStr)")
    case WhereOp(col, op, value) => println(s"WHERE $col $op $value")
    case _ => println(s"ERROR: Unknown expression $where")
  }
}
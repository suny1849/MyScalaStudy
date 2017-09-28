// 문자열과만 일치하는 부분 함수
val pf1: PartialFunction[Any, String] = { case s: String => "Yes" }
// 더블과만 일치하는 부분 함수
val pf2: PartialFunction[Any, String] = { case d: Double => "Yes" }

// 두 함수를 묶어서 문자열과 더블 모두 일치하는 새 부분 함수를 만듬
val pf = pf1 orElse pf2

// 부분 함수를 호출하고 발생하는 MatchError를 잡아내는 함수,
// 성공 여부와 관계없이 문자열 반환
def tryPF(x: Any, f: PartialFunction[Any, String]): String = {
  try {
    f(x).toString
  } catch {
    case _: MatchError => "ERROR"
  }
}

// isDefinedAt을 호출하여 문자열과 결과를 반환하는 함수
def d(x: Any, f: PartialFunction[Any, String]) = f.isDefinedAt(x).toString

// 여러 조합을 시도해서 결과를 표로 출력력
println("  | pf1 - String | pf2 - Double | pf - All")
println("x | def? | pf1(x) | def? | pf2(x) | def? | pf(x) ")
println("+++++++++++++++++++++++++++++++++++++++++++++++++")
List("str", 3.14, 10) foreach { x =>
  println("%-5s | %-5s | %-6s  | %-5s | %-6s  | %-5s | %-6s\n", x.toString,
    d(x,pf1), tryPF(x,pf1), d(x,pf2), tryPF(x,pf2), d(x,pf), tryPF(x,pf))
}
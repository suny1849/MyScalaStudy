package progscala2.sunystudy

object Ex_77 {
  def main(args: Array[String]): Unit = {
    var student1Ban = Map (
      1 -> "박선영",
      2 -> "박지영",
      3 -> "안영순",
      4 -> "박준석",
      5 -> "김주희",
      6 -> "김가희",
      7 -> "장신자",
      8 -> "박소영",
      9 -> "박기영",
      10 -> "안성란"
    )

    student1Ban += (11 -> "입양자")
    student1Ban -= 10

    var student2Ban = Map(
      12 -> "문재인",
      13 -> "이니야",
      14 -> "필리핀",
      15 -> "마닐라"
    )

    var students = student1Ban ++ student2Ban

    students.foreach(i => print(i))

    println()

    val callee = 5
    println("여기 " + callee + "번 없어 ???")

    println(students.contains(5))
  }
}

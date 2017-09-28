package progscala2.sunystudy

object Ex_62 {
  case class Person(name: String, age: Int, rank: String)

  def matchAndHi(person: Person): Unit = person match {
    case Person("이 멋남", 47, "회장") => println("회장님 오셨습니까!!!")
    case Person("김 쾨남", 77, "부회장") => println("부회장님 바보!!!")
    //case Person("박 솔로", 25, _) => println("마 ~ 솔로 영기 왜 왔어 ~~~~")
    //case Person("박 솔로", 25, r) => println(r + "님이 입장하셨습니다.")
    //case Person(name, age, rank) => println(name + " " + age + " " + rank + "님이 입장하셨습니다.")
    case Person(name, age, _) => if(age > 25) println(name + " " + age + "살 이구나! 선 봐라 ~~")
    //case Person(name, age, "사장") if age > 25 => println(name + " " + age + "살 이구나! 선 봐라 ~~")
    case _ => println("매치되는 결과가 없습니다.")
  }

  def main(args: Array[String]): Unit = {
    val person1 = Person("이 멋남", 47, "회장")
    val person2 = Person("김 쾨남", 77, "부회장")
    val person3 = Person("박 솔로", 27, "사장")

    matchAndHi(person1)
    matchAndHi(person2)
    matchAndHi(person3)
  }
}

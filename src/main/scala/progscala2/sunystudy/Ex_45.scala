package progscala2.sunystudy

object Ex_45 {
  def main(args: Array[String]): Unit = {
    val flyingWhale = new Animal
    flyingWhale.swim
    flyingWhale.fly

    val pig = new Animal2
    pig.eat
  }

  class Animal extends Flying with Swimming {
    override def swim = println("오버라이드된 메서드")
  }

  class Animal2 extends Eating {
    def eat = println("처 먹기만 하네, 꿀꿀 ~~~~~")
  }


  trait Flying {
    def fly = println("날아 보자고, 훨훨~~")
  }

  trait Swimming {
    def swim = println("수영을 하자고, 수웜 수웜~~")
  }

  trait Running {
    def run = println("졸라 달리자, 피이이이잉~~~~")
  }

  trait Eating {
    def eat
  }
}

package progscala2.sunystudy

object Ex_47 {
  def main(args: Array[String]): Unit = {
    val pig = new Pig
    pig.eat
    pig.shout
    pig.fly
  }

  class Pig extends  Animal with Flying with Eating {
    def shout = println("꿱꿱!!!!")
    def eat = println("쩝쩝!!!!")
  }

  abstract class Animal {
    def shout
  }

  trait Swimming {
    def swim = println("수영하네~~")
  }

  trait Flying {
    def fly = println("날자~~")
  }

  trait Eating {
    def eat
  }

  trait Running {
    def run = println("달려라~~~")
  }

}

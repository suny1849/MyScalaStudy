package progscala2.sunystudy

object Ex_48 {
  def main(args: Array[String]): Unit = {
    val robot = new Mazinga
    println(robot.shoot)
  }

  class Mazinga extends Robot with M16 with Bazooka with Daepodong {
    //override def shoot: String = super.shoot
    override def shoot: String = "어쭈구리 !!!!!!!"
  }

  abstract class Robot {
    def shoot = "뿅뿅"
  }

  trait M16 extends Robot {
    override def shoot = super.shoot + "M16 - 빵야!!"
  }

  trait Bazooka extends Robot {
    override def shoot = super.shoot + "Bazooka - 뿌왕!!"
  }

  trait Daepodong extends Robot {
    override def shoot = super.shoot + "Daepodong - 콰르르르릉!!"
  }

}

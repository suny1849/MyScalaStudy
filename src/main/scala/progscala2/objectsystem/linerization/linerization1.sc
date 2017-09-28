// src/main/scala/progscala2/objectsystem/linearization/linearization1.sc

class C1 {
  def m = print("C1")
}

trait T1 extends C1 {
  override def m: Unit = { print("T1 "); super.m }
}

trait T2 extends C1 {
  override def m: Unit = { print("T2 "); super.m }
}

trait T3 extends C1 {
  override def m: Unit = { print("T3 "); super.m }
}

class C2 extends T1 with T2 with T3 {
  override def m: Unit = { print("C2 "); super.m}
}

val c2 = new C2
c2.m
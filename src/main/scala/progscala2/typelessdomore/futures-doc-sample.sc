import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
val s = "Hello"
val f: Future[String] = Future {
  s + " future!"
}
f foreach {
  msg => println(msg)
}
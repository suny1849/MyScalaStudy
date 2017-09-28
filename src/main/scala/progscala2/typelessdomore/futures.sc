import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

def sleep(millis: Long) = {
  Thread.sleep(millis)
}

def doWork(index: Int) = {
  sleep((math.random * 1000).toLong)
  index
}

(1 to 5) foreach { index =>
  val future = Future {
    doWork(index)
  }

  future onSuccess {
    case answer: Int => println(s"Success! returnd: $answer")
  }

  future onFailure {
    case th: Throwable => println(s"FAILURE! returnd: $th")
  }
}

sleep(5000)
println("Finito!")
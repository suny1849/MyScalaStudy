package progscala2.introscala.shapes

import akka.actor.{Props, Actor, ActorRef, ActorSystem}
import com.typesafe.config.ConfigFactory

// 모든 동작을 시작하기 위해 이 파일 안에서만 사용하는 메시지로 비공개로 정의
// 특별한 시각 메시지를 사용하는 것도 액터 프로그래밍에서 흔히 사용하는 관용적 표현
private object Start

// 드라이버 액터를 만든다
object ShapesDrawingDriver {
  // 애플리케이션을 실행하고 진행하는 main 메서드
  // 이는 akka.actor.ActorSystem 만들고, ShapesDrawingActor와 ShapesDrawingDriver 액터를 만든다.
  def main(args: Array[String]) {
    val system = ActorSystem("DrawingActorSystem", ConfigFactory.load())
    val drawer = system.actorOf(Props(new ShapesDrawingActor), "drawingActor")
    val driver = system.actorOf(Props(new ShapesDrawingDriver(drawer)), "drawingService")
    // Start를 드라이버에 보내고 시작한다.
    driver ! Start
  }
}

// ShapesDrawingDriver 액터
class ShapesDrawingDriver(drawerActor: ActorRef) extends Actor {
  import Messages._

  def receive = {
    // receive 핸들러가 Start 메세지를 받으면, ShapesDrawingActor에 모양 메시지 3개,
    // 원주율 값, Exit, 이렇게 다섯 개의 비동기 메시지를 보낸다. 따라서 이 액터 시스템은 단기간 작동된다.
    case Start =>
      drawerActor ! Circle(Point(0.0,0.0), 1.0)
      drawerActor ! Rectangle(Point(0.0,0.0), 2, 5)
      drawerActor ! 3.14159
      drawerActor ! Triangle(Point(0.0,0.0), Point(2.0,0.0), Point(1.0,2.0))
      drawerActor ! Exit
    // Finished 메시지가 Exit에 대한 응답으로 도착하면,
    // Actor의 context 필드를 통해 접근해서 액터 시스템을 종료시킨다.
    case Finished =>
      println(s"ShapesDrawingDriver: cleaning up...")
      //context.system.shutdown()
      context.system.stop(self)
    // 응답 메시지가 도착하면 그냥 그 내용을 화면에 출력한다.
    case response: Response =>
      println("ShapesDrawingDriver: Response = " + response)
    // 앞에서와 마찬가지로 예상치 예상치 못한 메시지가 도착할 경우에 대한 기본 case 절이다.
    case unexpected =>
      println("ShapesDrawingDriver: ERROR: Received an unexpected message = " + unexpected)
  }
}

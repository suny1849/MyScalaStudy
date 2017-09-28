package progscala2.introscala.shapes

// 액터 간에 전송할 대부분으 메세지를 정의한 Messages 객체를 선언
// 이는 특정 동작을 일으키는 신호처럼 사용, 한 객체에서 메시지를 모아두는 것이 일반적인 관례
object Messages {                                                    // <1>
  // Exit와 Finished에는 따로 상태가 없다. 따라서 이들은 신호를 보내는 플래그(flag) 역할을 한다.
  object Exit
  object Finished
  // Response 케이스 클래스는 메세지를 수신한 다름,
  // 그 메세지를 송신한 액터에 임의의 문자열 메세지를 응답할 때 사용
  case class Response(messages: String)
}

// 액터를 정의하기 위해 이 추상 기반 클래스의 서브 클래스를 만든다.
import akka.actor.Actor

// 모양을 그릴 액터를 정의
class ShapesDrawingActor extends Actor {
  // Message에 정의한 세 메세지를 여기에 임포트
  // 스칼라에서는 임포트를 블록 안에 내포시킬수 있으며
  // 임포트한 값의 영역을 그 값을 사용할 장소로 한정 시킴
  import Messages._

  // 반드시 구현해야 하는 추상 메서드 Actor.receive 구현
  // Actor.receive는 들어오는 메세지를 처리하는 방식을 정의
  def receive = {
    // 메세지가 Shape의 인스턴스라면 첫 case 절과 일치
    // 모양(Shape)에 대한 참조를 변수 s에 대입.
    // 즉, 들어오는 메시지 타입이 Any이더라도 s의 타입은 Shape가 된다.
    case s: Shape =>
      // 모양 s 에 대해 draw를 호출, 이때 draw가 만들어내는 문자열을 처리하는 방법을 아는 익명함수를 넘긴다.
      // 여기서 넘긴 익명 함수는 그냥 받은 문자열을 출력한다.
      s.draw(str => println(s"ShapesDrawingActor: $str"))
      // 송신 액터에 응답 메시지를 보낸다.
      sender ! Response(s"ShapesDrawingActor: $s drawn")
      //sender.!(Response(s"ShapesDrawingActor: $s drawn"))
    // 메시지가 Exit와 같다. 이는 모든 작업이 끝났다는 신호임
    case Exit =>
      // 종료중 임을 알리는 메시지 출력
      println(s"ShapesDrawingActor: exiting...")
      // 송신 액터에 Finished 메시지를 보냄
      sender ! Finished
    // 이 부분은 모든것과 일치할 수 있는 '기본'절임
    // 이 부분은 unexpected: Any와 같다.
    // 이보다 앞에 오는 패턴 매치에서 일치하지 않은 모든 값과 일치한다.
    // 메시지는 unexpected 변수에 대입됨
    case unexpected =>
      // Response 응답 메시지를 만들고 출력
      val response = Response(s"Error: Unknown message: $unexpected")
      println(s"ShapesDrawingActor: $response")
      // 응답을 송신 액터에 보낸다.
      sender ! response
  }
}




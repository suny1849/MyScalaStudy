// 리터럴 구문을 사용해 원소가 3개인 Tuple3 타의 튜플을 만듬
val t = ("Hello", 1, 3.4)
println("Print the whole tuple: " + t)
// 튜플의 첫 원를 뽑아냄, 0이 아니라 1부터 시작
println("Print the first item: " + t._1)
println("Print the second item: " + t._2)
println("print the third item: " + t._3)

// 한 번에 세 값을 정의, 각각 튜플에 상응하는 위치에 있는 원소를 대입
val (t1, t2, t3) = ("World", '!', 0x22)
println(t1 + ", " + t2 + ", " + t3)

// Tuple3 팩토리 메서드를 사용해서 튜플을 만
val (t4, t5, t6) = Tuple3("World", '4', 0x23)
println(t4 + ", " + t5 + ", " + t6)
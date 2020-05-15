package p0511;

public class Test {// Test라는 class를 만들어야 메소드vartest 를 만들 수 있다.

	int a;// class 객체Test의 객체변수 a, 독립된 메서드 2개에서 같이 int a를 쓰겠다.전역변수 !=값을 전달하는것과는
			// 다르다/

	public void vartest() {// 메소드명(입력자료형Test 입력변수t) Test클래스의 객체를 입력받아 넘기겠다
		this.a++;// <-t.a++; 객체.객체변수 (a++:객체변수 a의 값을 1만큼 증가)
	}

	public static void main(String[] args) {
		Test m = new Test();// m이라는 객체생성
		m.a = 1;// Test클래스의 객체인 m을 넘기도록

		m.vartest();// ()안 m삭제 this.a++로 수정해서
		System.out.println(m.a);
	}

}

package p0511;

public abstract class Predator extends Animal {//new interface만들면 된다.이런 인터페이스가 있음을 알리고 개별적인 객체에서 이것을 채택
	public abstract String get();//return값 String타입으로 받겠다.
	
	
	public boolean isPredator(){//추상 클래스라서 메서드 추가 가능 
		return true;//구현? 
	}
}

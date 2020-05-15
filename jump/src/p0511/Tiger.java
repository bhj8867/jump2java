package p0511;

public class Tiger extends Predator {// interface채택하면 메서드 반드시 구현
	public String get() {
		return "사과";
	}
	
	public static void main(String[] args) {
		Tiger t = new Tiger();
		System.out.println(t.isPredator());//Predator에 있는 메서드 선택 사용 
	}
}
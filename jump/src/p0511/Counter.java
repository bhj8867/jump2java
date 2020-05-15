package p0511;

public class Counter {
	static int count = 0;

	Counter() {// 매개 변수
		this.count++;//new가 실행될때 마다 count++
	}

	public static int getCount(){//static매소드  안에서는 인스턴스 변수접근이 불가능 
		return count;//static int count 라서 스태틱 메소드에서 변수 접근 가능 해진다.

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1 = new Counter();//매개변수
		Counter c2 = new Counter();//static 매서드에서는 객체를 통한 매서드 호출 X/c2.getCount()ㅌ=\
		
		
		
		System.out.println(Counter.getCount());//static매서드라서 클래스를 통해 호출해야한다
	}

}

package p0511;

public class ZooKeeper {
	/*public void feed(Tiger t){//feed()함수는 같지만 자료 형이 다르다. Tiger 자료형의  t
		System.out.println("먹이 : 사과");
	}
	public void feed(Lion l){//Lion에 해당하는 변수 ㅣ
		System.out.println("먹이 : 바나나");
	}*/
	
	public void feed(Predator p){//interface의  p를 구현하는 feed메소드
		System.out.println(p.get());//interface의 get()을 가져온다.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZooKeeper z=new ZooKeeper();
		Tiger t=new Tiger();
		Tiger ti=new Tiger();
		Lion l=new Lion();
		//Cat c=new Cat();
		Dog d=new Dog();
		z.feed(t);
		z.feed(ti);
		z.feed(l);
		//z.feed(c);
		z.feed(d);
	}

}

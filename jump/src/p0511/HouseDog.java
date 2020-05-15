package p0511;

public class HouseDog extends Dog {// Animal-Dog-HouseDog

	public void sleep() {// 오버라이드 (구체화)
		System.out.println(this.name + " zzz in house ");
	}
	public void sleep(int h) {// 메서드  오버로딩(변수 추가):sleep() 함수 이름은 같지만 int h추가 가능
		System.out.println(this.name + " zzz in house for " + h + " hours");
	}
	public HouseDog(String name) {
		this.setName(name);
	}
	public HouseDog(int type) {// 생성자 오버로딩(추가) :대체 생성자(cf.디폴트 생성자 늘 생략)
		if (type == 1) {
			this.name = "Jindo";
		}
		if (type == 2) {
			this.name = "Bulldog";
		}
	}
	public static void main(String[] args) {
		
		 HouseDog housedog=new HouseDog(1); 
		 housedog.sleep();//오버라이딩 Dog에서 만든 sleep()에 +"in the house"(구체화)
		 housedog.sleep(10);//오버로딩
		 

		HouseDog happy = new HouseDog("happy");// 객체만들때 이미 이름이 넣어진 것을 만들자
		System.out.println(happy.name);// null->setName없이 생성자 함수를 지정해서 실행되게

		HouseDog j = new HouseDog(1);
		System.out.println(j.name);
		HouseDog b=new HouseDog(2);
		System.out.println(b.name);
		

	}

}

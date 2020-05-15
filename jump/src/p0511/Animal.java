package p0511;

public class Animal {
	String name;

	public void setName(String name) {// String 타입의 name값을 1개 넣겠다
		this.name = name;// body가 name에 들어간다.

	}

	public static void main(String[] args) {

		Animal cat = new Animal();
		Animal dog = new Animal();

		cat.setName("body");//입력
		dog.setName("happy");

		System.out.println(cat.name);//메소드:()
		System.out.println(dog.name);
		
	
		
	
	}

}

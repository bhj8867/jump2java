package p0511;

public class Dog extends Predator{//main 앞
	
	public void sleep(){//상속받았지만 새로운 sleep()메소드 만들수 있다.
		System.out.println(this.name+" zzz");
	}
	
	
	
	public static void main(String[] args) {
		Dog dog=new Dog();//Aimal dog=new Dog();가능
		dog.setName("MoMo");//extends Animal했기때문에 나옴
		
		System.out.println(dog.name);
		dog.sleep();
	}



	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "grape";
	}

}

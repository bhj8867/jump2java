package p0511;

public class Bouncer {//클래스 
		public void barkAnimal(Animal animal){//메소드(입력형태),animal객체를 받는다
			if(animal instanceof Tiger){//animal의 객체가  new Tiger로 만들어진 객체인가?
				 System.out.println("어흥");
			}else if (animal instanceof Lion){
				System.out.println("으르렁");
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal tiger=new Tiger();//객체생성
		Lion lion =new Lion();
		
		Bouncer bouncer=new Bouncer();
		bouncer.barkAnimal(tiger);//객체.메소드
		bouncer.barkAnimal(lion);

	}

}

package p0511;
class Phone{
	String model;
	int val;

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	void ptrint(){
		System.out.printf("*모델명 : %s *가격(만원):%d\n",model,val);
	}
}
public class PhoneDemo {
	public static void main(String[] args) {
		Phone p1=new Phone();
		p1.setModel("갤럭시s10");
		p1.setVal(100);
		p1.ptrint();

		System.out.print(p1.getModel());
	}

}

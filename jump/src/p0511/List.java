package p0511;

import java.util.ArrayList;

public class List {//array[]방의 갯수가 정해져 있다.

	public static void main(String[] args) {
		ArrayList p=new ArrayList();
		p.add("100");
		p.add("150");
		p.add("200");
		System.out.println(p.size());
		
		
		p.add(0,"99");
		System.out.println(p.get(0)+" : 0번째 앞에 삽입");//첫번째  값 앞에 삽입 3개->4개
		
		System.out.println(p.size());// ArrayList의 갯수
		System.out.println(p.get(3)+" 4번째 값 출력");//마지막(4번째)값 출력
		
		System.out.println(p.contains("160"));//항목값있는지 판단 (boolean)T/F
		System.out.println(p.remove(0)+" 첫번째 값 지움");//처음 값이 지워짐
		System.out.println(p.size());
	
	}

}

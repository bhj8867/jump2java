package p0511;

import java.util.ArrayList;

public class Generics {//자료형 <>지정

	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();
		
		alist.add("hello!!");
		alist.add("java!!");
	
		alist.add(0,"world");
		System.out.println(alist.size());//2->3개
		
		String s1=alist.get(0);
		String s2=alist.get(1);
		
		System.out.println(alist.get(0));
		System.out.println(s1);
		System.out.println(alist.get(1));
		System.out.println(s2);
		System.out.println(alist.contains("java"));
	}
	

}

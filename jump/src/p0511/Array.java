package p0511;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner  s=new Scanner(System.in);
		System.out.print("양의 정수 10개 입력 : ");
		int[] arr=new int[10];
		int i;

		for(i=0;i<arr.length;i++){
		arr[i]=s.nextInt();	
		System.out.print(arr[i]);
		}
		
		
		System.out.print("3의 배수 : ");
		for(i=0;i<arr.length;i++){
			
			if(arr[i]%3==0){
				System.out.print(arr[i]+" ");
			}
		}
		s.close();
	}

}

package p0511;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		String[] subject = { "java", "python", "jsp" };
		int[] score = { 95, 88, 76 };
		Scanner s = new Scanner(System.in);
		int i = 0;
		String name;

		while (true) { // 무한 루프
			System.out.print("과목명을 입력하세요 : ");
			name = s.next();

			for (i = 0; i < subject.length; i++) {
				if (subject[i].equals(name)) {
					System.out.println(subject[i] + "=" + score[i]);
				}
			}
			if (name.equals("그만")) {
				System.out.print("end");
				break;

			}
		}
		s.close();
	}
}
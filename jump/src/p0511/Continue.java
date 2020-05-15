package p0511;

public class Continue {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			i++;

			if (i % 2 == 0) {
				continue;// i값이 짝수라면 while문의 조건으로 돌아가고 if조건에 충족을 못할시에 출력 
			}//if end
			
			System.out.println(i);//홀수 출력
		}//while end

	}

}

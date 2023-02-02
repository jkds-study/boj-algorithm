import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	
		// Scanner 선언 및 정수 N개와 조건 X 변수를 선언한다 
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		// 결과를 담을 StringBuilder 선언
		StringBuilder sb = new StringBuilder();
		
		// 반복문을 사용해서 수열 A를 입력받는다
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			
			// X보다 작은 A값만 SringBuilder에 값을 넣는다
			if(a < x)
			{
				sb.append(a + " ");
			}
		}
		
		// 결과값 출력
		System.out.print(sb);
	}
}

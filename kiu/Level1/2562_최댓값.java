import java.util.Scanner;

public class max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[9];
		int max = 0;
		int count = 0;
		
		for(int j=0; j<9; j++) {
			int A = sc.nextInt();
			number[j] = A;
		}
		
		for(int k=0; k<9; k++) {
			if(number[k]>max) {
				max = number[k];
				count = k+1;
			}
		}
		System.out.println("가장큰수: "+max);
		System.out.println("가장큰수는 "+count+"번째 있다");
	}
}

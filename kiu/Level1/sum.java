import java.util.Scanner;
 
public class sum {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		String b = sc.next();
		sc.close();	
		int sum = 0;
   
		for(int i = 0; i < A; i++) {
			sum = sum + b.charAt(i)-48;
		}
		System.out.print(sum);
	}
}
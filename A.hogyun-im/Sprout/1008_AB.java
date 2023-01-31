import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		sc.close();
		double num3 = num1 / num2;
		System.out.print(num3);
	}
}

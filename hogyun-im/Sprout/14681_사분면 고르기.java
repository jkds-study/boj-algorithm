import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		if(num1>=1 && num2>=1)
		{
			System.out.print("1");
		}
		if(num1<=-1 && num2>=1)
		{
			System.out.print("2");
		}
		if(num1<=-1 && num2 <=-1)
		{
			System.out.print("3");
		}
		if(num1>=1 && num2 <=-1)
		{
			System.out.print("4");
		}
	}
}

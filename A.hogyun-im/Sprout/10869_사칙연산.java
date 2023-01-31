import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    		Scanner scanner = new Scanner(System.in);
		
    	int a = scanner.nextInt();
    	int b = scanner.nextInt();

    	int result;
    	
    	result = a+b;
        System.out.println(result);
        result = a-b;
        System.out.println(result);
        result = a*b;
        System.out.println(result);
        result = a/b;
        System.out.println(result);
        result = a%b;
        System.out.println(result);
	}
}

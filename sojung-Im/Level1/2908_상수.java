import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result1 = 0, result2 = 0;
        while(num1 > 0){
            result1 = (result1 * 10) + (num1 % 10);
            num1 /= 10;
        }
        while(num2 > 0){
            result2 = (result2 * 10) + (num2 % 10);
            num2 /= 10;
        }

        System.out.println(result1 > result2 ? result1 : result2);

        scanner.close();
    }
}
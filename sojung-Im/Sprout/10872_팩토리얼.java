import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int fact = 1;

        for(int i=2;i<=N;i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
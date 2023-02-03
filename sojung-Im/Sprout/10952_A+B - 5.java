import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            if(A+B > 0){
                System.out.println(A+B);
            } else {
                break;
            }
        }
        scanner.close();
    }
}
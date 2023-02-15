import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        H = M >= 45 ? H : H-1;
        M -= 45;

        System.out.println((24 + H) % 24 + " " + (60 + M) % 60);

        scanner.close();
    }
}
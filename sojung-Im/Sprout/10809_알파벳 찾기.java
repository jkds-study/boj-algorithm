import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        for(int i=97;i<=122;i++){
            System.out.print(str.indexOf((char)i) + " ");
        }
        System.out.println();
    }
}
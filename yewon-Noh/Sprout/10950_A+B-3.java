import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=0; i<n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a+b);
        }
    }
}
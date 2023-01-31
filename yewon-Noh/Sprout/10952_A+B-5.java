import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        while (true) {
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            if (n1==0&n2==0) break;
            System.out.println(n1+n2);
        }
    }
}
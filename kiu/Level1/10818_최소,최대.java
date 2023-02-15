import java.util.Scanner;

public class minmax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int min = 1000000, max = -1000000;

        for(int i = 0; i < A; i++) {
            int x = sc.nextInt();
            if(x < min) min = x;
            if(x > max) max = x;
        }

        System.out.println(min + " " + max);
    }
}

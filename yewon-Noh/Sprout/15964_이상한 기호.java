import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        long a = in.nextInt();
        long b = in.nextInt();
        System.out.println((a+b)*(a-b));
    }
}
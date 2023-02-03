import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int answer = 0;
        for (int i=0; i<5; i++) {
            double num = in.nextInt();
            answer += Math.pow(num, 2);
        }
        System.out.println(answer%10);
    }
}
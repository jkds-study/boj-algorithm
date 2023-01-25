import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        System.out.println(T.solution(n1));
    }

    public int solution(int n1) {
        if (n1%4==0 && (n1%100!=0 || n1%400==0)) return 1;
        return 0;
    }
}
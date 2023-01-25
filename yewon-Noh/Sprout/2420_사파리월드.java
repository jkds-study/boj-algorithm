import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        // 범위 주의 (-2,000,000,000 ≤ N, M ≤ 2,000,000,000)
        long n1 = in.nextLong();
        long n2 = in.nextLong();
        System.out.println(T.solution(n1, n2));
    }

    public long solution(long n1, long n2) {
        return Math.abs(n1-n2);
    }
}
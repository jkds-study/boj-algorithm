import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        // 입력되는 값의 범위가 1 ≤ A, B, C ≤ 1012 이므로 Long 타입을 사용한다.
        long n1 = in.nextLong();
        long n2 = in.nextLong();
        long n3 = in.nextLong();
        System.out.println(n1+n2+n3);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println(T.solution(n1, n2));
    }

    public int solution(int n1, int n2) {
        if (n1>0 && n2>0) return 1;
        else if (n1<0 && n2>0) return 2;
        else if (n1<0 && n2<0) return 3;
        else return 4;
    }
}
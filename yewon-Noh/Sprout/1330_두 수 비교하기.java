import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println(T.solution(n1, n2));
    }

    public String solution(int n1, int n2) {
        if (n1>n2) return ">";
        else if (n1<n2) return "<";
        else return "==";
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        System.out.println(T.solution(n1));
    }

    public String solution(int n1) {
        int n = n1/10;
        if (n>=9) return "A";
        else if (n==8) return "B";
        else if (n==7) return "C";
        else if (n==6) return "D";
        return "F";
    }
}
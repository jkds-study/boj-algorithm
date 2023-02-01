import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) a[i] = in.nextInt();
        int v = in.nextInt();
        System.out.println(T.solution(n, v, a));
    }

    public int solution(int n, int v, int[] a) {
        int answer = 0;
        for (int i=0; i<n; i++) {
            if (a[i]==v) answer++;
        }
        return answer;
    }
}

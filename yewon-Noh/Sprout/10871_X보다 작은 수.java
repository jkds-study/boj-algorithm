import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) a[i] = in.nextInt();
        for (Integer i: T.solution(n, x, a))  System.out.print(i + " ");
    }

    public ArrayList<Integer> solution(int n, int x, int[] a) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i=0; i<n; i++) {
            if (a[i] < x) answer.add(a[i]);
        }
        return answer;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        for (int i=0; i<n; i++)
            str[i] = in.next();
        for (int i:T.solution(n, str)) System.out.println(i);
    }

    public int[] solution(int n, String[] str) {
        int[] answer = new int[n];

        for (int i=0; i<n; i++) {
            String s = str[i];
            int sum=0, cnt=0;
            for (char x: s.toCharArray()) {
                if (x == 'O') sum += ++cnt;
                else cnt=0;
            }
            answer[i] = sum;
        }

        return answer;
    }
}

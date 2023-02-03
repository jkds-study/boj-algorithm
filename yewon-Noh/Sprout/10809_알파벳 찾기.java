import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        T.solution(str);
    }

    public void solution(String str) {
        HashMap<Character, Integer> alpha = new HashMap<>();
        for (char x: str.toCharArray()) {
            if (!alpha.containsKey(x) || alpha.get(x) >= 1) alpha.put(x, str.indexOf(x));
        }

        for (char c='a'; c<='z'; c++) {
            if (alpha.containsKey(c)) System.out.print(alpha.get(c) + " ");
            else System.out.print("-1 ");
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        boolean[] array = new boolean[30];
        for (int i=0; i<28; i++) {  // 28명 제출함
            int stu = in.nextInt();
            array[stu-1] = true;
        }
        for (int x: T.solution(array)) System.out.println(x);
    }

    public ArrayList<Integer> solution(boolean[] array) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i=1; i<=30; i++) {  // 총 학생수는 30명
            if (array[i-1]==false) answer.add(i);
            if (answer.size()>=2) break;
        }
        return answer;
    }
}

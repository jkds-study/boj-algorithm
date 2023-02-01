import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<N;i++){
            int num = scanner.nextInt();
            list.add(num);
        }

        int v = scanner.nextInt();
        int cnt = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i) == v){
                cnt++;
            }
        }
        
        System.out.println(cnt);

        scanner.close();
    }
}
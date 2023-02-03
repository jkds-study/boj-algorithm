import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> submit = new ArrayList<>();
        List<Integer> noSubmit = new ArrayList<>();

        for(int i=1;i<=30;i++){
            submit.add(i);
        }

        for(int i=0;i<28;i++){
            int num = scanner.nextInt();
            noSubmit.add(num);
        }

        submit.removeAll(noSubmit);
        Collections.sort(submit);

        for(int i=0;i<2;i++){
            System.out.println(submit.get(i));
        }

        scanner.close();
    }
}
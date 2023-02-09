import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num = new ArrayList<>();
        for(int i=0;i<9;i++){
            num.add(scanner.nextInt());
        }
        System.out.println(Collections.max(num));
        System.out.println(num.indexOf(Collections.max(num)) + 1);

        scanner.close();
    }
}
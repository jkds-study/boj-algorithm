import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String num = scanner.nextLine();
        String split[] = num.split("");
        int sum = 0;
        
        for(int i=0;i<N;i++){
            sum += Integer.parseInt(split[i]);
        }

        System.out.println(sum);

        scanner.close();
    }
}
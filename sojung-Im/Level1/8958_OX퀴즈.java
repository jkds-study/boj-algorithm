import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i=0;i<N;i++){
            int score = 0;
            String result[] = scanner.next().split("[X]+");
            for(int j=0;j<result.length;j++){
                int n = result[j].length();
                score += n * (n + 1) / 2;
            }
            System.out.println(score);
        }

        scanner.close();
    }
}
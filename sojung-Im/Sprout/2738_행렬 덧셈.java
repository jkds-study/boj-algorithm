import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int matrix[][] = new int[N][M];

        for(int i=0;i<2;i++){
            for(int j=0;j<N;j++){
                for(int k=0;k<M;k++){
                    matrix[j][k] += scanner.nextInt();
                }
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
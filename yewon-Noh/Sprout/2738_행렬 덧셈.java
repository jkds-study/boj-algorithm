import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                a[i][j] = in.nextInt();
            }
        }
        int[][] b = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                b[i][j] = in.nextInt();
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }
    }
}

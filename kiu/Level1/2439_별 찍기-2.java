import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        for (int i = 1; i <= A; i++) {
            for (int j=1; j <= A-i; j++) {
                 System.out.print(" "); 
            }
            for (int k = A-i; k < A; k++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
       

        sc.close();
        
        
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int H = in.nextInt();
        int M = in.nextInt();

        if (M < 45) {
            H--; 
            M += 15; // 60-45
            if (H < 0) H=23;
        }
        else {
            M -= 45;
        }
        System.out.print(H + " " + M);
    }
}

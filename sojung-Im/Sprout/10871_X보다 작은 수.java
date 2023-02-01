import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        String str = "";
        for(int i=0;i<N;i++){
            int num = scanner.nextInt();
            if(num < X){
                str += " " + num;
            }
        }
        System.out.println(str.trim());
        scanner.close();
    }
}
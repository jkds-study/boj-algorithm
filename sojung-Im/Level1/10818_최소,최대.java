import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int array[] = new int[N];

        int min = 1000001;
        int max = -1000001;
        for(int i=0;i<N;i++){
            array[i] = scanner.nextInt();
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min + " " + max);

        scanner.close();
    }
}
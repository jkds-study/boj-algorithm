import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[10];
        int count = 10;

        for(int i=0;i<10;i++){
            array[i] = scanner.nextInt() % 42;
            for(int j=0;j<i;j++){
                if(array[j] == array[i]){
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);

        scanner.close();
    }
}
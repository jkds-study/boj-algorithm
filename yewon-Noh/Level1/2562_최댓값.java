import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] array = new int[9];
        for (int i=0; i<9; i++) array[i] = in.nextInt();

        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i=0; i<9; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}

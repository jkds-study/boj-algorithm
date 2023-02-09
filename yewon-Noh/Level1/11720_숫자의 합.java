import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        String nums = in.next();

        int answer = 0;
        for (char x: nums.toCharArray()) answer += Character.getNumericValue(x);
        System.out.println(answer);
    }
}
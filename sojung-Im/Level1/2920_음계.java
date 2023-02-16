import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scale[] = new int[8];
        boolean ascending = false;
        boolean descending = false;

        for(int i=0;i<8;i++){
            scale[i] = scanner.nextInt();
            if(i == 0){
                if(scale[i] == 1){
                    ascending = true;
                } else if(scale[i] == 8){
                    descending = true;
                }
            } else {
                if(ascending && scale[i] != scale[i-1] + 1){
                    ascending = false;
                }
                if(descending && scale[i] != scale[i-1] - 1){
                    descending = false;
                }
            }
        }
        System.out.println(ascending ? "ascending" : (descending ? "descending" : "mixed"));
        
        scanner.close();
    }
}
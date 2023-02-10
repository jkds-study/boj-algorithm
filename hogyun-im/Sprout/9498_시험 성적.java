import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int score = scan.nextInt();
        char grade;
        
        if(90<=score && score<=100){
            grade='A';
        }
        else if(80<=score && score<=89){
            grade='B';
        }
        else if(70<=score && score<=79){
            grade='C';
        }
        else if(60<=score && score<=69){
            grade='D';
        }
        else
            grade='F';
        
        System.out.print(grade);
    }
}

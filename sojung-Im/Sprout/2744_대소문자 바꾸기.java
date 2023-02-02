import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        String word = "";
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                word += Character.toLowerCase(str.charAt(i));
            } else {
                word += Character.toUpperCase(str.charAt(i));
            }
        }

        System.out.println(word);
    }
}
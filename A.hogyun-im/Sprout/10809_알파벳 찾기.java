import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
 
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
 
		String str = in.nextLine();
 
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
    
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
 
		for(int val : arr) {
			System.out.print(val + " ");
		}
	}
}

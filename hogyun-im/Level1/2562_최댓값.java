import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);	
		int [] input =new int[9];
		int pig=0;
		int count=0;
        
		for(int i=0;i<9;i++) {
			input[i]=sc.nextInt();
		}
		for(int i=0; i<9;i++) {
			if(input[i]>pig) {
				pig=input[i];
				count=i+1;
			}
		}
		System.out.println(pig);
		System.out.println(count);		
  }
}

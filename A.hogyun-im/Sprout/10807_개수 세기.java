import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n, v;
    n = scanner.nextInt(); // 입력받을 정수의 개수 N
    int[] arr = new int[n]; // N개 만큼 배열에 정수 입력받기
    for(int i=0; i<n; i++) {
      arr[i] = scanner.nextInt();
    }
    v = scanner.nextInt(); // 개수를 찾을 정수 v

    int count=0; // v의 개수
    for(int i=0; i<n; i++) {
      if(arr[i] == v)
        count++;
    }
    System.out.println(count);
    scanner.close();
  }
}

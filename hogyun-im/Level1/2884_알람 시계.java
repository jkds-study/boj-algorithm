import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        // a, b는 입력할 시분 / c, d는 결과 시분
        int a;
        int b;
        int c;
        int d;
 
        // a, b의 값 입력
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        
        // b가 45보다 적은 경우 시간을 빼야한다.
        if(b < 45)
        {
            // 0시인 경우에는 23시로 표시한다. 그 외에 경우에는 1을 빼준다.
            if(a == 0)
            {
                c = 23;  
            }
            else 
            {
                c = a - 1;
            }
 
            // 45보다 작으면 60분에서 다시 빼야하므로 60을 더해서 뺀다
            d = 60 + b - 45;
        }
        // b가 45 이상인 경우 시간을 뺄 필요 없으므로 c = a, d = b - 45로 구한다.
        else 
        {
            c = a;
            d = b - 45;
        }
        
        // 결과 출력
        System.out.print(c + " " + d);
    }
}

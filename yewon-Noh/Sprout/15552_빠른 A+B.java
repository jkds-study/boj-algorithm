import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Scanner와 System.out.println를 사용하면 시간초과가 날 수 있다.
 * 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
 * 
 * - 풀이 참고 : https://st-lab.tistory.com/30 
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader와 BufferedWriter를 사용하기 위해서는 throws IOException을 해 주어야 한다.

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());  // 한 줄을 읽어 int 타입으로 바꾼다.
        for (int i=0; i<n; i++) {
            // 3 5 와 같이 여러개의 요소가 한 줄에 있는 경우는
            // readLine()을 통해 읽은 다음 StringTokenizer나 split()을 통해 따로 분리해야한다.
            StringTokenizer tokenizer = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            bw.write(a+b+"\n");  // 출력할 내용을 담는다.
        }
        bw.flush();  // 버퍼를 비워내는 동시에 콘솔에 출력한다.(반드시)
        bw.close();  // 출력이 끝나면 스트림을 닫는다.
    }
}
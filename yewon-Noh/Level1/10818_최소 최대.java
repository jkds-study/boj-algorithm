import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.print(min + " " + max);
    }
}

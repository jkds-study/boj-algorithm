import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      
        final int testCase = Integer.parseInt(br.readLine());

     
        StringBuilder sb = new StringBuilder();
        
        Stream.iterate(0, i -> i + 1).limit(testCase).forEach((i) -> {
            try {
                String input = br.readLine();
                sb.append(input.charAt(0)).append(input.charAt(input.length() - 1)).append("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
        br.close();
    }
}

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
            System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Seoul")).toString().substring(0, 10));
    }
}

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        LocalDate local = LocalDate.now(ZoneId.of("Asia/Seoul"));

        System.out.println(local.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }
}
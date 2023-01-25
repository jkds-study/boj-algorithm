import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 방법 1. date, SimpleDateFormat
//        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
//        Date date = new Date();
//        System.out.print(format.format(date));

        // 방법 2. LocalDate (기본적으로 YYYY-MM-DD 형식)
        LocalDate date = LocalDate.now();
        System.out.print(date);
    }
}

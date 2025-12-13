package b_datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date + "\n" + time);
        System.out.println(dateTime);

        
    }
}

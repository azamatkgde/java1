package datatime.azamat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class DateMethods {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println("Бүгүнкү күн: " + date);
        System.out.println("Азыркы убакыт: " + time);
        System.out.println("Бүгүнкү күн жана убакыт: " + dateTime);
        System.out.println("Часовой пояс боюнча толук убакыт: " + zonedDateTime);

    }
}

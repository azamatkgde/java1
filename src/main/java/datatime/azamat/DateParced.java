package datatime.azamat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateParced {
    public static void main(String[] args) {
        String input = "01.08.2025 17:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        LocalDateTime parced = LocalDateTime.parse(input, formatter);
        System.out.println(parced);
    }
}

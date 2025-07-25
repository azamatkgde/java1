package datatime.azamat;

import java.time.LocalDate;

public class DateOperation {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        LocalDate nextMonth = today.plusMonths(1);
        LocalDate lastYear = today.minusYears(1);

        System.out.println("Бүгүн: " + today);
        System.out.println("Эртең: " + tomorrow);
        System.out.println("Эмдиги ай: " + nextMonth);
        System.out.println("Былтыр: " + lastYear);
    }
}

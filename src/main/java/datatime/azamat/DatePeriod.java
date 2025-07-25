package datatime.azamat;

import java.time.LocalDate;
import java.time.Period;

public class DatePeriod {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1986,11,6);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthday, today);
        System.out.printf("Сен %d жаштасың (%d ай жана %d күн)",
                age.getYears(), age.getMonths(), age.getDays());
    }
}

package datatime.azamat;

import java.time.Duration;
import java.time.LocalTime;

public class TimeDuration {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(7, 15);
        LocalTime now = LocalTime.now();

        Duration duration = Duration.between(start, now);
        System.out.println("Секунда: " + duration.getSeconds());
        System.out.println("Минута: " + duration.toMinutes());
        System.out.println("Саат: " + duration.toHours());
    }
}

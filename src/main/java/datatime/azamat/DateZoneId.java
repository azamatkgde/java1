package datatime.azamat;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateZoneId {
    public static void main(String[] args) {
        ZonedDateTime berlinDate = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
        ZonedDateTime bishkekDate = ZonedDateTime.now(ZoneId.of("Asia/Bishkek"));

        System.out.println(berlinDate);
        System.out.println(bishkekDate);
    }
}

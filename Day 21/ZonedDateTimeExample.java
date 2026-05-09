import java.time.ZonedDateTime;
import java.time.ZoneId;


public class ZonedDateTimeExample{
    public static void main(String [] args){
        ZonedDateTime istanbulTime = ZonedDateTime.now(ZoneId.of("Europe/Istanbul"));

        System.out.println(istanbulTime);
    }
}
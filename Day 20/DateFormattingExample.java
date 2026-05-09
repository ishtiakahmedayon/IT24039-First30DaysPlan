import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormattingExample{
    public static void main(String[] args){
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //format the date

        String formattedDate = today.format(formatter);
        System.out.println("Before formatting: " + today);
        System.out.println("After formatting: " + formattedDate);
    }
}
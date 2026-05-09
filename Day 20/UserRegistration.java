import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class UserRegistration{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your birthdate (yyyy-MM-dd): ");
        String bdayInput = scanner.nextLine();

        LocalDate birthdate = LocalDate.parse(bdayInput);

        //defining format   
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");
        String formattedBirthDate = birthdate.format(formatter);

        System.out.println("hello " + name + "! Your birthday is: " + formattedBirthDate);

        scanner.close();

    }
}
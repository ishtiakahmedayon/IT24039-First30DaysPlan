import java.util.ArrayList;
import java.util.List;

public class Example{
    public static void main(String [] args){
        List<String> cities = new ArrayList<>();

        cities.add("Dhaka");
        cities.add("Cusco");
        cities.add("Havana");
        cities.add("Delhi");

        System.out.println("Cities" + cities);

        String firstCity = cities.get(0);
        System.out.println("First city:" + firstCity);
    }
}
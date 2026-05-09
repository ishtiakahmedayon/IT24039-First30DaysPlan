import java.util.ArrayList;

public class Example1{
    public static void main(String [] args){
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Dhaka");
        cities.add("Cusco");
        cities.add("Havana");
        cities.add("Delhi");

        System.out.println("First city: " + cities.get(0));

        cities.remove("Cusco");

        System.out.println("Cities List: " + cities);
    }
}
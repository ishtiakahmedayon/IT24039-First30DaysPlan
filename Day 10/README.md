### Example1.java
```
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
```
### Example2.java
```
import java.util.LinkedList;

public class Example2 {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();
        
        countries.add("India");
        countries.add("USA");
        countries.add("Japan");
        countries.add("Brazil");

        
        System.out.println("First courtry in the list: " + countries.get(0));
        System.out.println("Countries in the LinkedList:");
    }
}
```m
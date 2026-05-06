import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();
        
        countries.add("India");
        countries.add("USA");
        countries.add("Japan");
        countries.add("Brazil");
        
        System.out.println("Countries in the LinkedList:");
        System.out.println(countries);
    }
}
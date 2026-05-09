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
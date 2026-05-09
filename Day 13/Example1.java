import java.util.HashMap;

public class Example1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Dhaka", 1);
        map.put("Kolkata", 2);
        map.put("Korachi", 3);

        System.out.println("Value for key 'Dhaka': " + map.get("Dhaka")); // get() get a value for a key
        System.out.println(map.keySet()); // iterates key 
        System.out.println(map.containsKey("Dhaka")); // checks if a key existz
        System.out.println(map.remove("Korachi"));
        System.out.println(map);

    }
}

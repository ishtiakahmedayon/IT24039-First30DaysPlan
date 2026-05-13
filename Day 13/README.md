### Example1.java

```
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

```

### Example2.java

```
import java.util.TreeMap;

public class Example2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap = new TreeMap<>();

        tmap.put(24001, "Proshanti");
        tmap.put(24002, "Shomiddho");
        tmap.put(24003, "Dip");

        System.out.println(tmap);
        System.out.println("Value for key '24002': " +  tmap.get(24002));
        System.out.println(tmap.keySet()); // list of keys
        System.out.println(tmap.remove(24003));
        System.out.println(tmap);



    }
}
```
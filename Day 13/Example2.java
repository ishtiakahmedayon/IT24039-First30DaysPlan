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

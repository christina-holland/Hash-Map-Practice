import java.util.HashMap;
import java.util.Map;

public class Program {

    //Printing all the keys in the hashmap
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    //Printing the keys in the hashmap which contain the specified text
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    //Printing the values of keys in the hashmap which contain the specified text
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (Map.Entry<String, String> entry : hashmap.entrySet()) {
            if (entry.getKey().contains(text)) {
                System.out.println(entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        //Example usage
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }
}


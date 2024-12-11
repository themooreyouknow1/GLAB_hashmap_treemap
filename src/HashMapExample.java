import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
//        HashMap<Integer, String> languages = new HashMap<>();
//        languages.put(1, "Java");
//        languages.put(2, "Python");
//        languages.put(3, "JavaScript");
//        languages.put(4, "C#");
//
//        System.out.println("HashMap: " + languages);
//        String value = languages.remove(2);
//        System.out.println("Removed value: " + value);
//        System.out.println("Updated HashMap " + languages);

        //Example #2
        HashMap<String, String> newHashMap = new HashMap<>();
        newHashMap.put("Key1", "Lenovo");
        newHashMap.put("Key2", "Motorola");
        newHashMap.put("Key3", "Nokia");
        newHashMap.put("Key4", null);
        newHashMap.put(null, "Sony");

        //key and value
        System.out.println("Original map contains:" + newHashMap);
        //get size
        System.out.println("Size of original Map is:" + newHashMap.size());
        //copy to another
        HashMap<String, String> copyHashMap = new HashMap<>();
        copyHashMap.putAll(newHashMap);
        System.out.println("copyHashMap mappings= " + copyHashMap);
        //remove nulls
        String nullKeyValue = copyHashMap.remove(null);
        System.out.println("copyHashMap null key value = " + nullKeyValue);
        System.out.println("copyHashMap after removing null key = " + copyHashMap);
        System.out.println("Size of copyHashMap is:" + copyHashMap.size());


    }
}

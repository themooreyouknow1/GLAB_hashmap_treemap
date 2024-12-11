import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);

        //remove
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

        //remove method with 2 parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);
        System.out.println("Updated TreeMap: " + numbers);

        //EXAMPLE 2

        TreeMap<String, Integer> numbers2 = new TreeMap<>();
        numbers2.put("First", 1);
        numbers2.put("Second", 2);
        numbers2.put("Third", 3);
        System.out.println("TreeMap: " + numbers2);

        //use the firstkey() and lastKey() method:
        String firstKey = numbers2.firstKey();
        System.out.println("First key: " + firstKey);
        String lastKey = numbers2.lastKey();
        System.out.println("Last key: " + lastKey);

        //Use firstEntry and lastEntry():
        System.out.println("First Entry: " + numbers2.firstEntry());
        System.out.println("Last Entry: " + numbers2.lastEntry());

    }
}

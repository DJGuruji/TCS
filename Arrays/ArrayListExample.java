import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // 1. Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // 2. Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // 3. Adding an element at a specific index
        list.add(1, "Mango");

        // 4. Accessing elements using get() method
        System.out.println("Element at index 2: " + list.get(2));  // Output: Orange

        // 5. Updating elements using set() method
        list.set(2, "Pineapple");  // Replaces "Orange" with "Pineapple"
        System.out.println("Updated list: " + list);

        // 6. Removing an element by index
        list.remove(1);  // Removes "Mango"
        System.out.println("After removing element at index 1: " + list);

        // 7. Removing an element by value
        list.remove("Banana");  // Removes "Banana"
        System.out.println("After removing Banana: " + list);

        // 8. Checking if an element exists
        boolean hasApple = list.contains("Apple");
        System.out.println("Contains Apple? " + hasApple);  // Output: true

        // 9. Checking the size of the ArrayList
        int size = list.size();
        System.out.println("Size of the list: " + size);  // Output: 2

        // 10. Checking if the ArrayList is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);  // Output: false

        // 11. Clearing the ArrayList
        list.clear();
        System.out.println("After clearing the list: " + list);  // Output: []

        // 12. Checking if the ArrayList is empty after clearing
        isEmpty = list.isEmpty();
        System.out.println("Is the list empty now? " + isEmpty);  // Output: true
    }
}

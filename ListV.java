import java.util.*;

public class ListV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create String & Integer Lists
        List<String> str = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date"));
        List<Integer> str1 = new ArrayList<>();

        // Input 4 values for Integer List
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            str1.add(sc.nextInt());
        }

        // Sort both lists
        Collections.sort(str);
        Collections.sort(str1);

        // Remove 3rd and 2nd elements from both
        if (str.size() > 2) str.remove(2);
        if (str.size() > 1) str.remove(1);
        if (str1.size() > 2) str1.remove(2);
        if (str1.size() > 1) str1.remove(1);

        // Convert Integer List to Array
        Integer[] intArray = str1.toArray(new Integer[0]);

        // Ensure 1 and 2 are present, remove 2
        str1.clear();
        str1.addAll(Arrays.asList(1, 2));
        str1.remove(Integer.valueOf(2));

        // Add two more lists
        List<String> extraStr = Arrays.asList("elderberry", "fig");
        List<Integer> extraInt = Arrays.asList(9, 10);
        str.addAll(extraStr);
        str1.addAll(extraInt);

        // Print results
        System.out.println("Final String List: " + str);
        System.out.println("Final Integer List: " + str1);
        System.out.println("Converted Array: " + Arrays.toString(intArray));
    }
}
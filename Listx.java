import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listx {
    public static void main(String[] args) {
        String[] s1 = {"v", "b", "n", "d", "m"};
        String[] s = {"v", "b", "n", "d", "m"};
        int[][] i = {{1, 5, 8, 2, 3, 7},{2,20,4,5,6,7}};
        int[][] i2 = {{1, 5, 9, 2, 3, 0},{2,20,4,5,6,7}};
        char[] c = {'a', 'e', 'i', 'o', 'u'};

        // Fill example
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 42); // fills all elements with 42
        System.out.println("Filled array: " + Arrays.toString(fillArray));

        // Binary search on char[] (must be sorted)
        Arrays.sort(c); // required before binarySearch
        System.out.println("Index of 'i' in char array: " + Arrays.binarySearch(c, 'i'));

        // Partial binary search on string array
        Arrays.sort(s); // required before binarySearch
        int index = Arrays.binarySearch(s, 1, 4, "n"); // search between index 1 (inclusive) and 4 (exclusive)
        System.out.println("Partial binary search result: " + index);

       
        System.out.println("Using Deep equals: " + Arrays.deepEquals(i, i2));

        
        List<String> s3 = new ArrayList<>(Arrays.asList(s1));
        System.out.println("Add to s3: " + s3.add("rocky")); // returns true
        System.out.println("Updated list: " + s3);
    }
}
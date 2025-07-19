import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        String[] s1 = {"v", "b", "n", "d", "m"};
        String[] s = {"v", "b", "n", "d", "m"};
        int[][] i = {{1, 5, 8, 2, 3, 7},{2,20,4,5,6,7}};
        int[][] i2 = {{1, 5, 9, 2, 3, 0},{2,20,4,5,6,7}};

        char[] c = {'a', 'e', 'i', 'o', 'u'};
        Arrays.sort(c);
        
       // Arrays.sort(s); 
       // Arrays.sort(s, (a, b) -> a.compareTo(b));
        
        System.out.println(Arrays.binarySearch(s, "n"));

        int index = Arrays.binarySearch(s, 1, 4, "n"); 
        System.out.println("Partial binary search result: " + index);
        
        
        //System.out.println(Arrays.binarySearch(i, 7));
        //System.out.println(Arrays.equals(i,i2));
        System.out.println(Arrays.deepEquals(i,i2));
          
        

       
        System.out.println("Using Deep equals: " + Arrays.deepEquals(i, i2));

        
        List<String> s3 = new ArrayList<>(Arrays.asList(s1));
        System.out.println("Add to s3: " + s3.add("rocky")); 
        System.out.println("Updated list: " + s3);


        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 42); 
        System.out.println("Filled array: " + Arrays.toString(fillArray));

        char [] a = {'a','b','c','d'};
        char [] copy = Arrays.copyOf(a,3);
        System.out.println(copy);
        char [] copy1= Arrays.copyOfRange(a,2,a.length);
        System.out.println(copy1);

        String f[]= {"1","2","65","8","77"};
        if(Arrays.binarySearch(f, 65)>0 && Arrays.binarySearch(f, 77)>0){
            System.out.println("Yes both are present.");
        }





















        //write code here for implementing Arrays.fill


    }
}




















//Now create new arrays and do below operations
//1.do binary search for  character array
// 2.So Partial searching of String array using start index and end index.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ListP {
    public static void main(String[] args) {
        
        List<Integer> str1 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            str1.add(sc.nextInt());
        }
        
        System.out.println("Your Integer Array :" + str1);
        System.out.println("Removing index2 in str [Integer Array] : " + str1.remove(2));
        System.out.println("Removing index1 in str [Integer Array] : " + str1.remove(1));
        
        System.out.println("Integer Array after Removing :" + str1);


        List<String> str = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        System.out.println("Your String Array  :" + str);
        System.out.println("Removing index2 in str [String Array] : " + str.remove(2));
        System.out.println("Removing index1 in str [String Array] : " + str.remove(1));
        System.out.println("String Array after Removing :" + str1);

        List<String>list1 = new ArrayList<String>();
        list1.addAll(Arrays.asList(str));
        System.out.println(list1);
        list1.removeAll(list1);

        System.out.println(list2);
        

        
        //  List<String> a = Arrays.asList("a", "b", "c", "d", "e");

        
        // List<String> sub = a.subList(1, 4);

        // System.out.println("Sublist: " + sub); 
          List<String> a = Arrays.asList("a","b","c","d");
          List<String> sub = new ArrayList<>();

        int from = 1, to = 4; 
        for (int i = from; i < to && i < a.size(); i++) {
            sub.add(a.get(i));
        }

        System.out.println("Sublist " + sub); /







        //Extract sublist from ArrayList




























// Now Do all below operations
         //Create String List
        // Create a integer List 
        //Insert 4 Values using Keyboard and then Sort elements , Remove 3rd element and 2nd elemnt from both lists
        //Convert Integer List to Array
        //Make sure Integer list have Numbers 1,2 and remove 2 .
        //Add Two More lists to string and lists
    }
    
}

import java.util.*;

public class ListExp1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Lists:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Size of List " + (i + 1) + ":");
            int size = sc.nextInt();

            ArrayList<Integer> sub = new ArrayList<>();
            System.out.println("Enter " + size + " elements:");
            for (int j = 0; j < size; j++) {
                sub.add(sc.nextInt());
            }
            ls.add(sub);
        }

        System.out.println("Lists entered: " + ls);

        System.out.println("Enter the number of Queries:");
        int queries = sc.nextInt();

        System.out.println("Enter the queries in format: line_number element_position");

        for (int i = 0; i < queries; i++) {
            int ln = sc.nextInt();
            int ele = sc.nextInt();

            if (ln <= ls.size() && ln > 0) {
                ArrayList<Integer> sub = ls.get(ln - 1);
                if (ele <= sub.size() && ele > 0) {
                    System.out.println(sub.get(ele - 1));
                } else {
                    System.out.println("Error! Element index out of bounds.");
                }
            } else {
                System.out.println("Error! Line index out of bounds.");
            }
        }

        sc.close();
    }
}

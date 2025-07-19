import java.util.*;

public class problem1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> LL = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println("Enter size of list");
            int m = sc.nextInt();
            ArrayList<Integer> currentList = new ArrayList<>();
            System.out.println("Enter elements of list");
            for(int j = 0; j < m; j++){
                currentList.add(sc.nextInt());
            }
            LL.add(currentList);
        }

        //output from quries
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(y-1>LL.get(x-1).size()){
                System.out.println("ERROR!");
            }
            else{
            System.out.println(LL.get(x-1).get(y-1));
            }
        } 
        sc.close();
    }
}
/* N=5;

5 eelements given and then 3 elemnts given ..
   
   ln.add(sc.nextInt)//3 is added to ln ,ln contains 3 
 * 
 */
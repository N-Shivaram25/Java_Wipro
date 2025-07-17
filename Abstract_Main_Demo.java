abstract class Abstract_Demo {
    public abstract int sum(int a , int b);
    public abstract int prod(int a ,int b);
    public int add(int a,int b ,int c){
        return a + b + c;

    }

    
}
abstract class A  extends Abstract_Demo{
    
    public int prod(int a, int b){
        return a * b;
    }

    
}
 class B extends A
 {
    public int sum(int a , int b){
        return a + b;

    }

 }
public class Abstract_Main_Demo {
    public static void main(String[] args) {
        B b = new B();
    System.out.println(" Sum is : "+ b.sum(10,20));
    System.out.println(" prod is : "+ b.prod(10,20));
    System.out.println(" Add is : "+ b.add(10,20,30));
        
    }
    


    
}

class MethodOverride {

    int sum(int a,int b){
        return a + b;
    }

    
}
class A extends MethodOverride{
    int sum(int a, int b){
        return a * b;
    }
}
class B extends MethodOverride{
    int sum(int a,int b){
        return a/b;
    }
}
public class Override_Demo {
    public static void main(String[] args) {
        MethodOverride Mo = new MethodOverride();
        System.out.println("From class MethodOverride " + Mo.sum(10,20));

        A a = new A();
        System.out.println("From class  A " + a.sum(10,20));
        B b = new B();
        System.out.println("From class  B " + b.sum(10,20));
        MethodOverride Mo1 = new A();
        System.out.println("Result is " + Mo1.sum(10,20));
        


        
    }

    
}



class MethodOverload {

    double sum(int a,double b){
        return a + b;
    }

    
}
class A extends MethodOverload{
    double sum(int a, int b,double c ){
        return a * b * c;
    }
}
class B extends MethodOverload{
    int sum(int a,int b){
        return a/b;
    }
}
public class Overload_Demo {
    public static void main(String[] args) {
        MethodOverload Mo = new MethodOverload();
        System.out.println("From class MethodOverload " + Mo.sum(10,20.25));

        A a = new A();
        System.out.println("From class  A " + a.sum(10,20,30.25));
        B b = new B();
        System.out.println("From class  B " + b.sum(10,20));
        // MethodOverride Mo1 = new A();
        // System.out.println("Result is " + Mo1.sum(10,20));
        
        


        
    }

    
}



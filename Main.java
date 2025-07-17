 class A {
    int a = 10;
    int b = 20;
    int add = a + b;
    int multiply = a * b;
    int subtract = a - b;
   
    
}
class B extends  A{
    float divide = (float)a/b;
    

}
class Main{
    

public static void main (String[]args){
    B b = new B();
    System.out.println(b.divide);
    System.out.println(b.add);
    System.out.println(b.subtract);
    System.out.println(b.multiply);
    


}
}

public class Animal {
    void eat() {
        System.out.println("Animal is Eating");
    }
    void sleep() {
        System.out.println("Animal is Sleeping");
    }

    public static void main(String[] args) {
       
        Animal b = new Animal();
        b.eat();
        b.sleep();

        
        Bird x = new Bird();
        x.eat();   
        x.sleep(); 
        x.fly();  
    }
}

class Bird extends Animal {
   
    @Override
    void eat() {
        System.out.println("Animal is marking"); 
    }

    @Override
    void sleep() {
        System.out.println("Animal is Shading"); 
    }

    void fly() {
        System.out.println("Bird is flying");
    }
}
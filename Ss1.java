
class Ss1 {
    public static void main(String[] args) {
        // String str1 = "PHP Exercises and ";
        // String str2 = "Python Exercises";
        // String str3 = str1.concat(str2);
        // System.out.println(str3);

        boolean ans = true;
        String strA ="ample";
         String strB = "ssvn";
        if(strA.startsWith("a")){
            ans = true;
        }else {
            ans = false;
        }
        System.out.println(ans);
        String s4 = "MAGIC";
        char[] MagicArray = s4.toCharArray();
        for(char i : MagicArray){
            System.out.println(i);
        }
        String S5 = "Charan";
        System.out.println("The index value of a is :" +S5.indexOf("a"));

        // String sentence1 = "Ace Engineering College";
        // String [] b = args
        String str1 = "Arise";
        for (int i = 0; i < str1.length(); i++) {
            System.out.println("'" + str1.charAt(i) + "' is at index " + i);
        }

        //Immutable to Mutable
        //String builder is faster than String buffer but not thread safe

        String str = "Live Streaming";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);
        sb.reverse();
        System.out.println("Using Reverse function : "+ sb);
        System.out.println("Substring of 5 is : "+ sb.substring( 5));
        //Convert String to substring

        String str10 = "WindMill Game";
        String sub = str10.substring(4, 6);
        System.out.println(sub); 
//class is a holder or conatiner which holds /we place data and Procedures/ operations in it.
//Synonymn :Skeleton , blueprint,structure , template.
//class : concrete class', These classes have body with members.
//Member: variables and methods && data and actions.

// Abstract class : This class is defined by the keyword abstract.
// //wrapper class
// singleton class
// anonymous class
//Object is a real World Entity ,
// Car c , here c is a instance of Car
// Car c = new Car(); , here c is an object . using new keyword complete class is  generated.
// object is used to access the propertiesor members of the class
// Inheritance ==> One class Acquiring the properties of another class is called inheritance.

// Base class - Super class - Parent class 
// Derived class - Sub class - child class 
//The keyword used to perform inheritance in java is "extends"
//Poly Morphisms - Many forms
//Compile tme Polymorphism and Run time PolyMorphism'
// Polymorphism : Method Overloading - Compile time P/Static polymorphism -->same class
// Method Overriding - RunTimeP /DP. -->Diff class
//3. Encapsulationn and Abstraction
//Encapsulation : We can modify the data which is   private using setter and getter methods
//Encapsulation --> int n = 20;
//Interface --> interface is an abstract .i doesnt holds any new variables or unknown variables. Interface can have body. or a class line is ther in interfxcse.
// Messaging
//Garbage Collection
//Final Finally Finalise in java
//Sytem.gc Garbage value //finalize






    }
}
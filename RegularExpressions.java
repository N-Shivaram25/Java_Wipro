import java.util.Arrays;

public class RegularExpressions {
    public static void main(String[] args) {
        String s1 = "Mahesh";
        String s = "ACE Engineering College";
 
       
        boolean containsE = s.matches(".*e.*");
        System.out.println("Using regex to check 'e' : " + containsE);
        System.out.println("Using contains: " + s.contains("e"));

        System.out.println("Indented: " + s.indent(5));
        System.out.println("Repeated: " + s1.repeat(3));
        System.out.println("IndexOf CE: " + s.indexOf("CE"));
        System.out.println("LastIndexOf CLG: " + s.lastIndexOf("CLG"));
        System.out.println("ReplaceFirst CE with ME: " + s.replaceFirst("CE", "ME"));
        System.out.println("Replace CE with VM: " + s.replace("CE", "VM"));
        System.out.println("ReplaceAll CE with BC: " + s.replaceAll("CE", "BC"));
        System.out.println("Substring from index 1: " + s.substring(1));
        System.out.println("Substring (1,2): " + s.substring(1, 2));

        
        char[] ch = s.replaceFirst("C", "c").toCharArray();
        System.out.println("Char Array: " + Arrays.toString(ch));
        for (char character : ch) {
            System.out.println(character + "c");
        }

        
        System.out.println("Substring (1,6): " + s.substring(1, 6));

       
        System.out.println("Strip Leading: '" + s.stripLeading() + "'");
        System.out.println("Strip Trailing: '" + s.stripTrailing() + "'");

        
        System.out.println("Exact match 'Mahesh Babu': " + s1.matches(" Mahesh Babu"));
    }
}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class New {
    static String str1 = "STUNNING";
    public static void main(String[] args) {
        New obj = new New();
        if(obj.str1.isEmpty()){
            System.out.println("True");
            
        }else{
            System.out.println("false");
            
        }
        int a = obj.str1.length();
        System.out.println("Length of String a :" + a);
        
        String str2 = "codeslash";
        int b = str2.compareTo(obj.str1);
        System.out.println(b);
        
        String str3 = str2.toUpperCase();
        System.out.println("Using Uppercase method : " + str3);
        
        String str4 = str1.toLowerCase();
        System.out.println("Using Lowercase method : " + str4);
        
        boolean c = str2.equals(str3);
        boolean d = str2.equalsIgnoreCase(str3);
        System.out.println("Using Equals Method : " + c);
        System.out.println("Using Equals Ignore method  : " + d);
        
        String[] splitvar = str4.split("/",3);
        for (String i : splitvar){
            System.out.println(i + " ");
        }
        
        String f = String.join("",str2,str3);
        System.out.println(f);
        
        boolean Matchvalue = true;
        boolean Containvalue = true;
        String str5 = "a ce";
        String str6 = "ce";
        if(str5.matches(str6)){
            Matchvalue = true;
        }
        else{
            Matchvalue = false;
        }
        System.out.println("String 5 and 6 are Matching : " +Matchvalue);
        if(str5.contains(str6)){
            Containvalue = true;
        }
        else{
            Containvalue = false;
        }
        System.out.println("Is String5 alphabets contains in String6 ?  : " +Containvalue);
        
        String str7 = "Now";
        String str8 = str7.replace('N' ,'W');
        System.out.println("String 8 : " +str8);
        
        
        
        
        
        
        
        
        
        
    }
}
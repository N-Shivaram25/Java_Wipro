class Calculator {
    
    static int powerInt(int num1, int num2) {
        return (int)Math.pow(num1, num2);
    }
    static double powerDouble(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        
        int resultInt = Calculator.powerInt(2, 3);        
        double resultDouble = Calculator.powerDouble(2.5, 2);  

        System.out.println("Integer Power: " + resultInt);
        System.out.println("Double Power: " + resultDouble);
    }
}

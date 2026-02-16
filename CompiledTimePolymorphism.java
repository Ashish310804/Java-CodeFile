public class CompiledTimePolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 ints: " + calc.add(10, 20));        
        System.out.println("Sum of 3 ints: " + calc.add(10, 20, 30));     
        System.out.println("Sum of doubles: " + calc.add(5.5, 4.5));     
        System.out.println("Sum of doubles: " + calc.add(5, 4.5));  
        System.out.println("Sum of doubles: " + calc.add(5.5, 4));   
    }
}


class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {    
        return a + b;
    }
    double add(int a , double b){
        return a + b;
    }
    double add(double a , int b){
        return a + b;
    }
}



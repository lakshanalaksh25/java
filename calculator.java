public class calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public double add(double a, int b) {
        return a + b;
    }
    public double add(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        calculator calc = new calculator();

        System.out.println("add(2, 3) = " + calc.add(2, 3));                   
        System.out.println("add(2, 3, 4) = " + calc.add(2, 3, 4));            
        System.out.println("add(2.5, 3.2) = " + calc.add(2.5, 3.2));           
        System.out.println("add(2.5, 3) = " + calc.add(2.5, 3));              
        System.out.println("add(2, 3.5) = " + calc.add(2, 3.5));               
    }
}


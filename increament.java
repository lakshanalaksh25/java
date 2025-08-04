public class increament{
    public static void main(String[] args) {
        int a = 1;
        int b = a++;
        a++;
        int c = a++ + ++b + ++a;
        System.out.println(c);
    }
    
}

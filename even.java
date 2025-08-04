public class even {
    public static void main(String[] args) {
        int a = 0;

        System.out.println("Even numbers from 0 to 10:");

        while (a <= 10) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}


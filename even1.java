import java.util.Scanner;

public class even1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the upper limit to print even numbers: ");
        int limit = sc.nextInt();

        int a = 0;

        System.out.println("Even numbers from 0 to " + limit + ":");

        while (a <= limit) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }

        sc.close();
    }
}

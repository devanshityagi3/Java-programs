import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c, n;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        n = sc.nextInt();
        System.out.println(a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.println(" " + c);
            a = b;
            b = c;
        }

        sc.close();
    }
}

import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        int max, a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        max = a;
        if (b > max)
            System.out.println("b is largest");
        else if (c > max)
            System.out.println("c is largest");
        else
            System.out.println("a is largest");
        sc.close();
    }
}

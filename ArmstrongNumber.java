import java.util.Scanner;

class ArmstrongNumber{
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isArmstrong(n));
        sc.close();
    }
    static boolean isArmstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
        int rem= n%10;
        n=n/10;
        sum=sum+rem*rem*rem;
        }
        return sum==original;
    }
   
}

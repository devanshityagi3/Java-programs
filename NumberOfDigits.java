import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=8930299;
        int rem,ctr=0;
        
        while(n>0){
            rem=n%10;
            if(rem==9)
            {
                ctr++;
            }
            n=n/10;
        }
        System.out.println(ctr);
        sc.close();
    }
}

public class ReverseOfANumber {
    public static void main(String[] args) {
        int n=79304; 
        int rem,rev=0;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}
